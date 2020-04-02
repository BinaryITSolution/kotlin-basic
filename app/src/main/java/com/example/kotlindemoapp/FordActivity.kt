package com.example.kotlindemoapp

import android.hardware.TriggerEventListener
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class FordActivity : AppCompatActivity() {
    private val TAG = "abstract"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ford)

        val ford = Car()
        ford.colors = "Yellow"
        ford.engineNo = 121456
        ford.CC = "250CC"

        ford.fourWheel()
        //ford.info()
        ford.drive()
        ford.giveBreak()

       /* val v = Vehicle()
        v.info()
        v.CC
        v.seat*/

       /* val student = Student()
        student.stdClass()
        student.walk()
        student.talk()
        student.eat()
        student.height = 50
        Log.d(TAG,"i am talking ${student.height}")


        val tb = Television()
        tb.brand
        Log.d("Remote","Brand: ${tb.brand}")
        tb.on()
        tb.off()
        tb.volDown()
        tb.volUp()

        val tv = Television.TelevisionUsbPort()
        tv.ub1 = "usb1"
        tv.usb2 = "usb2"
        tv.usb()

        val tv1 = Television().TelevisionHdmiPort()
        tv1.hdmi()*/

        /*
        var stdData = StudentData("DemoName","Demo Last Name",25)


        Log.d(TAG,"Name: ${stdData.name} LastName: ${stdData.lastName}  Age: ${stdData.age} ")

        val  sil = DatabaseService.create(stdData)
        Log.d(TAG,"Name: ${sil.name} LastName: ${sil.lastName}  Age: ${sil.age} ")

        val  sil2 = DatabaseService.create(stdData)
        Log.d(TAG,"Name: ${sil2.name} LastName: ${sil2.lastName}  Age: ${sil2.age} ")

         */

        val a = Television.A1
        Television.foo()






    }


}
