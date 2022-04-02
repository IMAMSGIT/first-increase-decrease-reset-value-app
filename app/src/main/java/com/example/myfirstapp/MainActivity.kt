package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var count=0 // initialised a variable to increase latter
    private lateinit var countTextView: TextView // created a variable of TextView type
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       countTextView=findViewById(R.id.countTV) // to find our TextView by id
    }

    fun clickMe(view: View) {
        count++
        countTextView.text=count.toString()

    }

    fun clickDecrease(view: View) {
        count--
        countTextView.text=count.toString()
    }

    fun clickReset(view: View) {
        count=0
        countTextView.text=count.toString()
    }


}