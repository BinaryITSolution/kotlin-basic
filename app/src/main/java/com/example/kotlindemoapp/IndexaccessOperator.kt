package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class IndexaccessOperator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indexaccess_operator)

        val a = intArrayOf(10,5,60,7,12)
        println(a[2])
        println(a.get(3))


    }

    
}
