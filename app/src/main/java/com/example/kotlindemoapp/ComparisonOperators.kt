package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ComparisonOperators : AppCompatActivity() {
    private val TAG = "ComparisonOperators"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comparison_operators)

        val a = 20
        val b = 30

        if (a > b) {
            Log.e(TAG, "a is larger then b")
        }
        else {
            Log.e(TAG, "b is larger then a")
        }

        if (a < b) {
            Log.e(TAG, "a is less then b")
        }
        else {
            Log.e(TAG, "b is less then a")
        }

        if (a >= b) {
            Log.e(TAG, "a is >=  b")
        }
        else {
            Log.e(TAG, "b is >=  a")
        }

        if (10 >= 10) {
            Log.e(TAG, "true")
        }
        else {
            Log.e(TAG, "false")
        }

        if (a == b) {
            Log.e(TAG, "true")
        }
        else {
            Log.e(TAG, "false")
        }

        if (a != b) {
            Log.e(TAG, "true")
        }
        else {
            Log.e(TAG, "false")
        }
    }
}
