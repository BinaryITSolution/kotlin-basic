package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class WhenExpression : AppCompatActivity() {
    private val TAG = "WhenExpression"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when_expression)

        foo(40)
        foo2(5)
    }

    fun foo(a: Int){
        when(a){
            10 -> Log.i(TAG,"a == 10")
            20 -> Log.i(TAG,"a == 20")
            30 -> Log.i(TAG,"a == 30")
            else -> {
                Log.i(TAG,"a is not in the list")

            }
        }

    }

    fun foo2(a: Int){
        when(a){
            in 1..10 -> Log.i(TAG,"a is in 1 to 10 range")
            10 -> Log.i(TAG,"a == 10")
            20 -> Log.i(TAG,"a == 20")
            30 -> Log.i(TAG,"a == 30")
            else -> {
                Log.i(TAG,"a is not in the list")

            }
        }

    }
}
