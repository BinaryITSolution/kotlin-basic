package com.example.kotlindemoapp

import android.util.Log

abstract class Person {

    private val TAG = "abstract"

    var age: Int  = 0
    var name: String = ""
    abstract var height:Int

    fun walk(){
        Log.d(TAG,"i am walking")
    }

    open fun talk() {
        Log.d(TAG,"i am talking")
    }

    abstract fun eat()
}