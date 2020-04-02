package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class YamahaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yamaha)

        val yamaha = Bike()
        yamaha.colors = "Yellow"
        yamaha.engineNo = 121456
        yamaha.CC = "250CC"
        yamaha.twoWheel()
        //yamaha.info()
        yamaha.drive()
        yamaha.giveBreak()

}
}
