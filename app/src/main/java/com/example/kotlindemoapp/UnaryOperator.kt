package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class UnaryOperator : AppCompatActivity() {
    private val TAG = "UnaryOperator"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unary_operator)

        var a = 20
        var b = -30
        var c = true;

        var result1  = +a
        Log.e(TAG, result1.toString())

        var result4  = -a
        Log.e(TAG, result4.toString())

        var result2  = +b
        Log.e(TAG, result2.toString())

        var result3  = -b
        Log.e(TAG, result3.toString())

        var result5  = !c
        Log.e(TAG, result5.toString())

        var result6  = ++a
        Log.e(TAG, result6.toString())

        var result7  = --a
        Log.e(TAG, result7.toString())

        //Unary Operator

        var result8  = a.unaryPlus()
        Log.e(TAG, result8.toString())

        var result9  = a.unaryMinus()
        Log.e(TAG, result9.toString())

        var result10  = b.unaryPlus()
        Log.e(TAG, result10.toString())

        var result11  = b.unaryMinus()
        Log.e(TAG, result11.toString())

        var result12  = c.not()
        Log.e(TAG, result12.toString())

        var result13  = a.inc()
        Log.e(TAG, result13.toString())

        var result14  = result13.dec()
        Log.e(TAG, result14.toString())
    }
}
