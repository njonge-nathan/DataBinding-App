package com.example.databindingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.databindingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val mainBinding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView(this@MainActivity,R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding.btnPrint.setOnClickListener {
            if (mainBinding.etTitle.text.toString().isEmpty()){
                mainBinding.etTitle.error = "Required"
            }else if (mainBinding.etDesc.text.toString().isEmpty()){
                mainBinding.etDesc.error = "Required"
            }else
                mainBinding.titleStr = mainBinding.etTitle.text.toString()
                mainBinding.descStr = mainBinding.etDesc.text.toString()

        }
    }
}