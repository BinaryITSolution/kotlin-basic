package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ExceptionsHandling : AppCompatActivity() {
    private val TAG = "ExceptionsHandling"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exceptions_handling)


        try{
            val result = 10 / 2
            Log.e(TAG,"Result = $result")
            println("Result = $result")
        }
        catch (er: Exception){
            Log.e(TAG,er.message)
        }
        finally {
            Log.e(TAG,"Finally i am done!")
        }
    }
}
