package app.money.exchange.viewmodel

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
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
     var inputNumber : String? = null
    var totalInputs = MutableLiveData("")

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
                    }
                }

                RatesMD.postValue(retroValue.rates)
            }catch (e : Exception) {
                RatesMD.postValue(null)

            }
        }
        return RatesMD
    }

    fun onClick(view : View){
        if (inputNumber.isNullOrEmpty()){
            inputNumber = "0"
            totalInputs.value = (inputNumber!!.toInt() * moneyvalue.toDouble()).toString()
        }else{
            totalInputs.value = (inputNumber!!.toInt() * moneyvalue.toDouble()).toString()
        }
        Log.e("DATA", "Nakikiclick ang $totalInputs = $inputNumber * $moneyvalue")
    }
}

