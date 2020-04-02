package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_kotlin_function.*
import java.math.BigInteger

class KotlinFunction : AppCompatActivity() {
    private val TAG = "KotlinFunction"
    private var a: Int = 0
    private var b: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_function)

        /*
        a = 100
        b = 50
        //cal()
        cal(a, b)
        val fullName = fullName("Demo", "1234")
        Log.e(TAG, fullName)

        val percent = findPercentAmount(120, 10)
        Log.e(TAG, percent.toString())

        calDimension(length = 8, width = 10, height = 5)
         */

        getFibonacciNumber(7, 0.toBigInteger(), 1.toBigInteger()).toString()

    }

    fun cal() {
        val result1 = a + b
        Log.e(TAG, result1.toString())

        val result2 = a - b
        Log.e(TAG, result2.toString())
    }

    fun cal(a: Int, b: Int): Int {
        val result1 = a + b
        Log.e(TAG, result1.toString())

        return result1
    }

    fun fullName(fistName: String, lastName: String): String {

        return "$fistName $lastName"
    }

    fun findPercentAmount(price: Int = 150, percent: Int, divider: Int = 100): Int {

        return price - (price * percent / divider)
    }

    fun calDimension(width: Int, height: Int, length: Int) {
        val value = height * width * length
        Log.e(TAG, value.toString())

    }

    /*
    Kotlin Recursion (Recursive Function)  and Tail Recursion
    Fibonacci Number 0 1 1 2 3 5 8 13
     */
    tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {
        Log.e(TAG,(a + b).toString())
       return if (n == 0) a else  getFibonacciNumber(n - 1,a + b, a)
    }


}
