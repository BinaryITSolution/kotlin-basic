package com.example.kotlindemoapp.sort

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlindemoapp.R
import kotlinx.android.synthetic.main.activity_sort.*

class SortActivity : AppCompatActivity() {
    companion object {
        const val TAG = "SortActivity"
    }
    val arr1 = arrayOf(6, 8, 1, 4, 10, 7, 8, 9, 3, 2, 5) //average / original
    val arr2 = arrayOf(10, 9, 8, 8, 7, 6, 5, 4, 3, 2, 1) // worst
    val arr3 = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10) // best
    val arr4 = arrayOf(6, 1, 8, 4, 10, 2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sort)

        btn_bubble_sort.setOnClickListener {
            bubbleSort(arr2)
        }
        btn_selection_sort.setOnClickListener {
            selectionSort(arr3)
        }

    }

    private fun bubbleSort(l: Array<Int>) {

        var swap = true
        var counter  = 0
        while (swap){
            swap = false
            counter += 1
            for (i in 0 until l.size - 1) {
                if (l[i] > l[i + 1]) {
                    swap = true
                    val temp1 = l[i]
                    val temp2 = l[i + 1]
                    l[i] = temp2
                    l[i + 1] = temp1
                }
                counter += 1
                Log.e(TAG,"Counter: $counter current selection sort: ${l.contentToString()}" )
            }

        }

    }

    private fun selectionSort(a: Array<Int>){

        var spot_marker = 0
        var counter  = 0

        while (spot_marker < a.size){

            counter += 1

            for (i in spot_marker until a.size){
                if (a[i] < a[spot_marker]){

                    val temp1 = a[spot_marker]
                    val temp2 = a[i]
                    a[spot_marker] = temp2
                    a[i] = temp1
                }
                counter += 1
                Log.e(TAG,"Counter: $counter current selection sort: ${a.contentToString()}" )
            }
            spot_marker += 1

        }


    }

    private fun implementationSort(a: Array<Int>){
        var counter = 1
        while (counter < a.size) {
            Log.e(TAG, a.contentToString())
            var index = 1
            for (i in 0 until a.size - 1) {

                if (a[index] < a[i]) {
                    val temp1 = a[i]
                    val temp2 = a[index]
                    a[i] = temp2
                    a[index] = temp1
                }
                index += 1
            }
            Log.e(TAG, "irritation : $counter")
            counter += 1

        }

    }
}

