package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class DataTypeConversion : AppCompatActivity() {
    private val TAG = "DataTypeConversion"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_type_conversion)

        val a: Byte = 127
        val b: String = "Demo String"
        val c: String = "1000"

        var toIntVal = a.toInt()
        toIntVal = 128
        Log.i(TAG,toIntVal.toString())

        var toLongVal = c.toLong()
        toLongVal = 1000000
        Log.i(TAG,toLongVal.toString())

    }
}
