package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ToyotaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toyota)

        var toyota = Car()

        //toyota.info()
        toyota.drive()
        toyota.giveBreak()
    }
}
