package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LogicalOperators : AppCompatActivity() {
    private val TAG = "LogicalOperators"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logical_operators)

        val a = 10
        val b = 20
        val c = -10

        var result : Boolean

        result  = (a>b) && (a>c)
        Log.e(TAG,result.toString())

        result  = (a>b) || (a>c)
        Log.e(TAG,result.toString())

    }
}
