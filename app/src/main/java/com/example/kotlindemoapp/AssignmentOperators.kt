package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_assignment_operators.*

class AssignmentOperators : AppCompatActivity() {

    var a = 10.0
    var b = 3.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment_operators)

        //val result = a + b
        a += b
        etxtAdd.setText(a.toString())

        a -= b
        etxtSub.setText(a.toString())

        a *= b
        etxtMul.setText(a.toString())

        a /= b
        etxtDiv.setText(a.toString())

        a %= b
        etxtModolus.setText(a.toString())

    }
}
