package com.example.kotlindemoapp

class Car: Vehicle(){ //this is a child class / sub class

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

    init {
        colors = "Red"
        engineNo = 0
        CC = "2500CC"
        Seat = "4 Seat"


        if (colors == "White"){
            println(colors)
        }
        println("Color: $colors EngineNo: $engineNo CC: $CC")

    }

    /*
    init {
        if (color == "Red"){
            println(color)
        }
        println("Color: $color EngineNo: $engineNo CC: $CC")

    }

     */

   override fun defaut(){

   }


    fun fourWheel(){
        println("fourWheel")
    }

    override fun drive() {
        super.drive()
        println("I am Driving a car")
    }

}