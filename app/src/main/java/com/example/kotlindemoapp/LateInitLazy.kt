package com.example.kotlindemoapp

import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LateInitLazy : AppCompatActivity() {
    private val Tag = "LateInitLazy"

    private var uo:UnaryOperator ? = null
    private lateinit var lo:LogicalOperators

    private val name:String by lazy { "This is a default value" }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_late_init_lazy)

        uo = UnaryOperator()
        lo = LogicalOperators()

        println("Lazy: ${name}")

    }
}
