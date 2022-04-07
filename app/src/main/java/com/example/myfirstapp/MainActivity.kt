package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var count=0 // initialised a variable to increase latter
    private lateinit var countTextView: TextView // created a variable of TextView type
    private lateinit var personImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        countTextView=findViewById(R.id.countTV) // attached the textview to the button pressed
        personImage=findViewById(R.id.personIV) // set mipmap image to personImage object
        personImage.setImageResource(R.drawable.count) // set count image to personImage object
    }

    fun clickToDecrease(view: View) {
        count++
        setCount()
    }

    fun clickDecrease(view: View) {
        count--
        setCount()
    }

    fun clickToReset(view: View) {
        count=0
        setCount()
    }
private fun setCount(){
    countTextView.text=count.toString()
}

}