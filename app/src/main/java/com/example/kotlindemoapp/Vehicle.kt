package com.example.kotlindemoapp

open class Vehicle { // this is a parent class / super class

    var colors: String = ""
    var engineNo: Int = 0
    internal  var CC: String = ""
    protected var Seat: String = ""


    private fun info() {
        println(colors)
        println(engineNo)
        println(CC)
    }

    protected open fun defaut() {
        println(colors)
        println(engineNo)
        println(CC)
    }

    open fun drive() {
        println("I am Driving")
    }

    fun giveBreak() {
        println("I am Break")
    }
}