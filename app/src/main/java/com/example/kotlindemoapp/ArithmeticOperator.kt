package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_arithmetic_operator.*

class ArithmeticOperator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arithmetic_operator)

        //addition + operators
        val a =  2 + 5
        etxtAdd.setText(a.toString())
        //subtraction - operators
        val b = 10 - 5
        etxtSub.setText(b.toString())
        // multiplication  * operators
        val c = 10 * 5
        etxtMul.setText(c.toString())
        // division  / operators
        val d = 100 / 5
        etxtDiv.setText(d.toString())
        //modules  % operators
        val e = 10 % 3
        etxtModolus.setText(e.toString())

        //string concatenation using + operator
        val firstName = "Android"
        val lastName = "Developer"
        var fullName = firstName + " " + lastName;
        txtFullName.text = fullName

        //plus operator
        var sum  = a + b
        sum   = a.plus(b)
        etxtAdd.setText(sum.toString())

        //minus operator
        var sub = a - b
        sub = a.minus(b)
        etxtSub.setText(sub.toString())

        //multiplication operator
        var mul  = a * b
        mul  = a.times(b)
        etxtMul.setText(mul.toString())

        //division operator
        var div  = a / b
        div =  a.div(b)
        etxtDiv.setText(div.toString())

        //modules operator
        var modo = a % b
        modo = a.rem(b)
        etxtModolus.setText(modo.toString())

        fullName = firstName.plus(" ".plus(lastName))
        txtFullName.text = fullName

    }
}
