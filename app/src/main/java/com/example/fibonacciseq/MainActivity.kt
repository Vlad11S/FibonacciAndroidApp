package com.example.fibonacciseq

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       textViewSequence.setMovementMethod(ScrollingMovementMethod())

        var n: Long = 0 // init number of terms
        var sequence = "";


        fun CalcFibonacci(n: Long): Long {
            if (n < 2) return n
            var t1: Long = 1
            var t2: Long = 0
            var result = t1
            for (i in 2..n) {
                result = t1 + t2
                t2 = t1
                t1 = result
            }
            return result // return fibonacci N term
        }




        fun DisplayFib() {
         var finalVal = CalcFibonacci(n).toString()
            CurrentNumberText.setText(finalVal)
            textViewSequence.setText(sequence)
            sequence += finalVal + ", "

        } // display current number and add it to the list




        NextNumberButton.setOnClickListener{
            DisplayFib()
            n++
        }    // display content and go to the next one number



    }
}