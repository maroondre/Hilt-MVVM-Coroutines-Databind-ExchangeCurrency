package app.money.exchange.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.money.exchange.connection.Retroservices
import app.money.exchange.connection.Retroservices.usds
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.*

class RatesVm : ViewModel() {

     var RatesMD: MutableLiveData<HashMap<String, String>> = MutableLiveData()
     var moneyvalue : String = ""

    val exe = CoroutineExceptionHandler { _, _ ->
        RatesMD.postValue(null)
    }

    fun ratesVMCalls(country: String, tocountry: String): MutableLiveData<HashMap<String, String>>
    {
        viewModelScope.launch(exe + Dispatchers.IO){
             val retroValue = Retroservices.retrofits(usds)!!.getCurrency(country)
                RatesMD.postValue(null)
            try{
                for ((key, value) in retroValue.rates.entries) {
                    if(key.contains(tocountry)) {
                        Log.e("DATA $key", "ANG Value $value")
                        moneyvalue = value
                        Log.e("DATA $key", "ANG SunodValue $moneyvalue")

                        //Second value and so on ng spinner di na lumalabas to
                        var converted = 0.0
                            converted = (moneyvalue.toInt() + 20).toDouble()
                        Log.e("DATA", "ANG SAGOT ${converted.toDouble()}")
                    }
                }
                    /*println("While Loop:")
                    val iterator: Iterator<*> = retroValue.rates.entries.iterator()
                    while (iterator.hasNext()) {
                        if(iterator.equals(tocountry)) {
                            val me2 = iterator.next() as Map.Entry<*, *>
                            Log.e("Key: " + me2.key, " & Value: " + me2.value)
                        }
                    }*/

                RatesMD.postValue(retroValue.rates)
            }catch (e : Exception) {
                RatesMD.postValue(null)

            }
        }
        return RatesMD
    }

    fun refresh(from : String, to :String){
        ratesVMCalls(from,to)
    }
}

