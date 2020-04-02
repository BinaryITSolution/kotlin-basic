package com.example.kotlindemoapp

class Bike: Vehicle() { //this is a child class / sub class

    /*
    var color: String = color // property
    var engineNo: Int = engineNo // property
    var cc: String = CC // property

    constructor(color: String,engineNo: Int,CC: String){
        this.color = color
        this.engineNo = engineNo
        this.cc = cc
    }
     */
/*
    init {
        if (color == "White"){
            println(color)
        }
        println("Color: $color EngineNo: $engineNo CC: $CC")

    }

    init {
        if (color == "Red"){
            println(color)
        }
        println("Color: $color EngineNo: $engineNo CC: $CC")

    }

 */




    fun twoWheel(){
        println("twoWheel")
    }

    override fun drive(){
        println("I am Driving a bike")
    }
}