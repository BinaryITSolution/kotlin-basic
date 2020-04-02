package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class InOperator : AppCompatActivity() {
    private val TAG = "InOperator"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_in_operator)

        val listOfNum = intArrayOf(41,45,60,80,15)


        if (45 in listOfNum){
            Log.e(TAG,"45")
        }

        if (10 in listOfNum){
            Log.e(TAG,"10")
        }

        if (10 !in listOfNum){
            Log.e(TAG,"10 is not in the list")
        }







    }
}
