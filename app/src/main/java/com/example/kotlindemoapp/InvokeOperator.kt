package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class InvokeOperator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_invoke_operator)

        foo1()
        foo2.invoke("Demo Name")

        var a = 127
        
    }

    val foo1 = {
        println("Hello World")
    }

    val foo2 = { name:String ->
        println("Name : $name")

    }
}
