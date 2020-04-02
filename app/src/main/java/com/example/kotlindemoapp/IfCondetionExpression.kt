package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class IfCondetionExpression : AppCompatActivity() {
    private val TAG = "IfCondetionExpression"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_if_condetion_expression)

        val value1 = 100
        val value2 = 200

        if (value1 < value2){
            Log.i(TAG, " value1 is less then value2")
        }
        else {
            Log.i(TAG, " value1 is greater then value2")
        }

        if (value1 > value2){
            Log.i(TAG, " value1 is less then value2")
        }
        else if(value1 == value2){
            Log.i(TAG, " value1 and value2 are equal")
        }
        else if(value1 < value2){
            Log.i(TAG, "true")
        }
        else {
            Log.i(TAG, " value1 is greater then value2")
        }

        //if expression
        val result  = if (value1 < value2){
            " Expression "
        }
        else {
            " value1 is greater then value2"
        }

        Log.i(TAG,result)

    }
}
