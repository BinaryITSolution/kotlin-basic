package com.example.kotlindemoapp

import android.nfc.Tag
import android.util.Log

class Television: Remote {

    private val TAG = "Remote"

    override val brand: String = "SAMSUNG"

    companion object {

        var A1 = "Demo"

        fun foo(){
            Log.d("Remote","Television foo(")
        }

    }



    override fun off() {
        Log.d("Remote","Television off")

    }

    override fun on() {
        Log.d("Remote","Television on")

    }

    override fun volUp() {
        super.volUp()
        Log.d("Remote","Television volUp")
    }

    override fun volDown() {
        super.volDown()
        Log.d("Remote","Television volDown")

    }

    class TelevisionUsbPort{

        var ub1 = ""
        var usb2 = ""

        fun usb(){
            Log.d("Nested","I am a usb nested class")
        }

    }

    inner class TelevisionHdmiPort{

        var hdmi1 = ""
        var hdmi2 = ""

        fun hdmi(){
            Log.d(TAG,"I am a hdmi inner class")
        }

    }



}