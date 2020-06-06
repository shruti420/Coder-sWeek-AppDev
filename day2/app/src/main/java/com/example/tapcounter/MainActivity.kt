package com.example.tapcounter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //count for number of button clicks
    var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTap(view: View?) {
        //incorrect count
         count++
         //locate textview and update the label

        val textview = findViewById(R.id.textView) as TextView
        textview.text = "You clicked $count times"
    }
}