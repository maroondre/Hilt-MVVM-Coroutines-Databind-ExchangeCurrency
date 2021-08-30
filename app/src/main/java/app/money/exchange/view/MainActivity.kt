package app.money.exchange.view

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import app.money.exchange.R
import app.money.exchange.databinding.ActivityMainBinding
import app.money.exchange.model.Lists
import app.money.exchange.viewmodel.RatesVm
import java.util.*


class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    lateinit var binding : ActivityMainBinding
    var list : Lists = Lists()
    var viewModel : RatesVm = RatesVm()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this).get(RatesVm::class.java)
        binding.ratesVM = viewModel
        binding.ratesView = this
        binding.lifecycleOwner = this

        val spinnerArrayAdapter: ArrayAdapter<String> = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item,
            list.list
        )
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item) // The drop down view

        binding.fromspinner.adapter = spinnerArrayAdapter
        binding.toSpinner.adapter = spinnerArrayAdapter
        binding.toSpinner.onItemSelectedListener = this


    }

    private fun rates()
    {
        val from = binding.fromspinner.selectedItem.toString()
        val to = binding.toSpinner.selectedItem.toString()

        viewModel = ViewModelProvider(this).get(viewModel::class.java)
        viewModel.ratesVMCalls(from,to).observe(this, Observer {
            if(it == null) {
                Toast.makeText(this,"WALA LAMAN LODS",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"MARAMING LAMAN LODS",Toast.LENGTH_LONG).show()
            }
        })
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        rates()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        //Wakwak
    }

}