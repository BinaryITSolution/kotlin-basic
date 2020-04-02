package com.example.kotlindemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    /*
    //Byte
    var myByte: Byte = 0
    var myByte2: Byte = 10

    //Short
    var myShort: Short = 0
    var myShort2: Short = 0

    //Int
    var myInt1: Int = 0
    var myInt2: Int = 0
    var myInt3 = 0

    //Long
    var myLong1: Long = 0
    var myLong2 = 0L

    //Float
    var myFloat1: Float = 10.20F
    var myFloat2 = 20.02F

    //Double
    var myDouble1: Double = 10.20
    var myDouble2 = 20.25

    //Number
    var myNumber: Number = 0

    //Boolean
    var myBool1: Boolean = false
    var myBool2: Boolean = true

    //Char
    var myChar1: Char = 'A'
    var myChar2 = 'B'

    //String/*
    /*
    Strings are a sequence of characters
     */

    var myString1: String = ""
    var myString2 = "Hello World!"


    /*var age = 0
    var name = ""
    val lastName = ""*/

     */

     */

    private var text: TextView? = null //Nullable types


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        /* age = 20
         name = "Kotlin"
         lastName = "Java"*/
        //Byte  = 8bit = 1Byte
        //Range = -128 to 127 / Signed Numbers = - + numbers
        myByte = 127
        myByte2 = -128

        //Short =  16bit  = 2Byte
        //Range  = -32768  to 32767 /Signed Numbers = - + numbers
        myShort = 1000
        myShort2 = -1200

        //Int = 32bit  = 4Byte
        //Range  = -2^31 to = 2^31-1 / Singed Numbers  = - + numbers
        myInt1 = 10000
        myInt2 = -10000
        myInt3 = 2000000

        //Long = 64Bit = 8Byte
        //Range = -2^63 to 2^63 /Signed Numbers  = -+ number
        myLong1 = 10000
        myLong2 = -10000
        var myLong3 = 10000000000

        //Float = 32Bit = 4Byte  / Single Precision
        myFloat1 = 10F / 3F
        Log.e("Float", myFloat1.toString())

        myFloat2 = Float.MAX_VALUE
        Log.e("Float", myFloat2.toString())

        myFloat2 = Float.MIN_VALUE
        Log.e("Float", myFloat2.toString())

        //Double = 64Bit  = 8Byte / Double Precision /
        myDouble1 = 10.0 / 3.0
        Log.e("Double", myDouble1.toString())

        myDouble2 = Double.MAX_VALUE
        Log.e("Double", myDouble2.toString())

        myDouble2 = Double.MIN_VALUE
        Log.e("Double", myDouble2.toString())

        //Number
        myNumber = 10
        myNumber = -1200
        myNumber = 10.02F
        myNumber = 10.25

        //Boolean
        if (myBool1) {
            Log.e("Boolean", "Is true")
        } else {
            Log.e("Boolean", "Is false")
        }

        if (myBool2) {
            Log.e("Boolean", "Is true")
        } else {
            Log.e("Boolean", "Is false")
        }

        //Char
        myChar1 = 'B'
        //myChar2 = "ABC"

        //String
        Log.e("TAG", myString2[0].toString())
        Log.e("TAG", myString2[1].toString())
        Log.e("TAG", myString2[2].toString())
        Log.e("TAG", myString2[3].toString())
        Log.e("TAG", myString2[4].toString())

        myString2 = "Hello There!"

        /*
        String Literals
        A literal is the source code representation of a fixed value. For example,
        "Hey there!" is a string literal that appears directly in a program without requiring computation (like variables).
        There are two types of string literals in Kotlin:
        1. Escaped string
        2. Raw String
         */
        var myString3 = "Hi There \n How are you? \t I am fine here!"
        Log.e("TAG", myString3)
        /*
        \t - Inserts tab
        \b - Inserts backspace
        \n - Inserts newline
        \r - Inserts carriage return
        \' - Inserts single quote character
        \" - Inserts double quote character
        \\ - Inserts backslash
        \$ - Inserts dollar character
         */

        var myString4 = """
            | This is my 1st line
            | This is my 2nd line
            | This is my 3rd line
            | This is my 4th line
        """.trimIndent()

        Log.e("TAG", myString4.trimMargin())

        var myString5 = """
            - This is my 1st line
            - This is my 2nd line
            - This is my 3rd line
            - This is my 4th line
        """.trimIndent()

        Log.e("TAG", myString5.trimMargin("-"))

        /*Kotlin String Templates
        Kotlin has an awesome feature called string templates that allows strings to contain template expressions.
        A string template expression starts with a dollar sign $.
     */
        var a  = 10
        var b = 20
        var result = "The sum of a + b = ${a.plus(b)}"
        Log.e("TAG", result)

        var a1  = 10
        var b1 = 20
        var result1 = """
            | The sum of a + b = ${a1.plus(b1)}
            | That is a good result.
        """.trimIndent()
        Log.e("TAG", result1.trimMargin())

        //String Properties and Function
        val s1 = "kotlin"
        var s2  = "Java"
        var result2: String = ""

        result2 = "The length of the s1  = ${s1.length}"
        Log.e("TAG", result2)

        result2 = " The s1 index on 1 = ${s1.get(1)})"
        Log.e("TAG", result2)

        result2 = "substring ${s1.subSequence(1,3)}"
        Log.e("TAG", result2)

         */

        /*
        Kotlin Null Safety - Nullable types - and Non-Null Types
         */

        //text = findViewById(R.id.textView)

        //safe call ?
        text?.text = "Hello safe call"

        //not null assertion
        text!!.text = "Non-Null Types"


    }
}
