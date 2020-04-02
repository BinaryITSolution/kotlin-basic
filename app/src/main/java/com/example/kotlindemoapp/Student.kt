package com.example.kotlindemoapp

import android.util.Log

class Student: Person() {
    private val TAG = "abstract"

   init {
       age = 25
       name = "Demo Name"
   }

    override var height: Int = 0
        get() = 10


    fun stdClass(){
        Log.d(TAG,"I am a student class")
    }



    override fun eat() {
        Log.d(TAG,"i am eating")
    }
}