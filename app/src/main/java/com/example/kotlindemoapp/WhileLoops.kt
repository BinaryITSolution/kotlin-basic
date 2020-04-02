package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class WhileLoops : AppCompatActivity() {
    private val TAG = "WhileLoops"

    var a = 1
    var b = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_while_loops)

       /* while (true){
            Log.i(TAG, "is always true")
        }*/

        while (a < 1){
            Log.i(TAG, "current value for a : $a")
            a++

        }

        do {
            Log.i(TAG, "current value for b : $b")
            b++

        }while (b < 1)
    }
}
