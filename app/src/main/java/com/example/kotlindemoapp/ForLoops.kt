package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ForLoops : AppCompatActivity() {
    private val TAG = "ForLoops"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_for_loops)

        val array = intArrayOf(1,2,3,4,5,6)

        foo1(0,20)

        for (i in 0..100){
            Log.i(TAG,"$i")
        }

        for (i in array){
            Log.i(TAG,"$i")
        }

        for (i in 100  downTo 0){
            Log.i(TAG,"$i")
        }
    }

    fun foo1(a: Int,b: Int){

        for (i in a..b){
            Log.i(TAG, "$i")
        }

    }
}
