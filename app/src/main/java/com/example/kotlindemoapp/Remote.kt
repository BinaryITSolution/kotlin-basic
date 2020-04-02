package com.example.kotlindemoapp

import android.util.Log

interface Remote {

    val brand: String


    fun off() // abstract by default

    fun on()

    fun volUp(){  //  open by default
        Log.d("Remote","Remote volUp")
    }

    fun volDown(){
        Log.d("Remote","Remote volDown")
    }
}