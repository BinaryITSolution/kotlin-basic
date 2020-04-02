package com.example.kotlindemoapp.array

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlindemoapp.R
import java.util.ArrayList

class ArrayActivity : AppCompatActivity() {
    companion object {
        const val TAG = "ArrayActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_array)


        var array1 = arrayOf(1,5,2,8,7,9)
        var array2 = arrayOf<String>("Apple","Boy","Cat","Dog")
        var array3 = intArrayOf(1,5,2,8,7,9)
        var array4 = booleanArrayOf(false,true,true)
        var array5 = arrayOf<Int>(1,5,2,8,7,9)
        var array6 = arrayOf(1,5,2,8,7,9,"Apple","Boy","Cat","Dog",10.5,2.01)
        var array7 = Array(5){0}
        var array8 = Array(5){""}


        array1.set(0,10)
        array1[1] = 15
        Log.d(TAG," ${array1.get(0)} : ${array1.get(1)}")

        //array2.get(0)
        Log.d(TAG," ${array2.get(0)}")
        Log.d(TAG," ${array2[0]}")


        array7.set(0,10)
        array7.set(1,20)
        array7.set(2,30)
        array7.set(3,40)
        array7.set(4,50)
        //array7.set(5,10)

        array8.set(0,"Apple")
        array8.set(1,"Boy")
        array8.set(2,"Cat")
        array8.set(3,"Dog")
        array8.set(4,"Egg")


        for (i in array7){
            Log.d(TAG,"Array7 value : ${i}")
        }

        for (element in array8){
            Log.d(TAG,"Array8 value : ${element}")
        }

        for (i in 0..array6.size-1)
        {
            Log.d(TAG,"Array6 value : index = ${i}  value = ${array6[i]} ")
        }

        /*
        var list1 = listOf("Apple","Ball","Cat","Dog","Egg")
        for (elements in list1){
            Log.d(TAG,"List1: $elements")
        }

        var list2 = list1.plus("Fish")
        for (elements in list2){
            Log.d(TAG,"List2: $elements")
        }

        val list3 = listOf(1,5,2,8,7,9,"Apple","Boy","Cat","Dog",10.5,2.01)
        for (elements in list3){
            Log.d(TAG,"List3: $elements")
        }

        val list4 = listOf<Int>(1,5,2,8,7,9)
        val list5 = listOf<String>("Apple","Boy","Cat","Dog")

        Log.d(TAG,"List3: ${list3.get(4)}")
        Log.d(TAG,"List3: ${list3[4]}")
        Log.d(TAG,"List3: ${list3.size}")
        Log.d(TAG,"List3: ${list3.contains("Apples")}")
        Log.d(TAG,"List3: ${list3.isEmpty()}")
        Log.d(TAG,"List3: ${list3.drop(5)}")
        Log.d(TAG,"List3: ${list3.dropLast(2)}")
        */


        /*
        var mList1 = mutableListOf("Apple","Ball","Cat","Dog","Egg")
        for (elements in mList1){
            Log.d(TAG,"mList1: $elements")
        }
        mList1.add("Fish")
        mList1.add("Gold")
        for (elements in mList1){
            Log.d(TAG,"mList1: $elements")
        }

        var mList2 = mutableListOf<Int>()
        mList2.add(1)
        mList2.add(2)
        mList2.add(3)


        var mList3 = mutableListOf<String>()
        mList3.add("Apple")
        mList3.add("Ball")
        mList3.add("Cat")

        var mList4 = mutableListOf<Any>()
        mList4.add(15)
        mList4.add(15.10)
        mList4.add(false)
        mList4.add("Apple")


        Log.d(TAG,"index: ${mList1[2]}")

        mList4.add(1,10)
        for (elements in mList4){
            Log.d(TAG,"mList4: $elements")
        }

        mList4.addAll(mList3)
        for (elements in mList4){
            Log.d(TAG,"mList4: $elements")
        }

        mList4.remove("Apple")
        for (elements in mList4){
            Log.d(TAG,"mList4: $elements")
        }

        mList4.removeAt(0)
        for (elements in mList4){
            Log.d(TAG,"RemoveAt mList4: $elements")
        }

        mList3.removeAll(mList3)
        Log.d(TAG,"Size mList3: ${mList3.size}")

        mList4.clear()
        Log.d(TAG,"Size mList4: ${mList4.size}")
        */

        /*
        val aList = ArrayList<String>()
        aList.add("Apple")
        aList.add("Boy")
        aList.add("cat")
        aList.add("Dog")

        val aList2 = ArrayList<Int>()
        aList2.add(10)

        val aList3 = ArrayList<Any>()
        aList3.add("Apple")
        aList3.add(10)

        val aList4 = ArrayList<Any>(5)
        aList4.add("Apple")
        aList4.add(10)
        aList4.add(false)
        aList4.add(10.20)
        aList4.add("Ball")
        aList4.add(1010)
        aList4.add(200)

        for (i in aList4){
            Log.d(TAG,"aList4:  $i")
        }

        aList4.addAll(aList3)
        for (i in aList4){
            Log.d(TAG,"aList4:  $i")
        }


        Log.d(TAG,"aList4:  ${aList4.get(0)}")
        aList4.set(aList4.size-1,20)
        for (i in aList4){
            Log.d(TAG,"aList4:  $i")
        }

        Log.d(TAG,"aList4 index of ball:  ${aList4.indexOf("Ball")}")

        aList4.remove("Apple")
        aList4.removeAt(aList4.size-1)
        for (i in aList4){
            Log.d(TAG,"aList4:  $i")
        }
         */







    }
}
