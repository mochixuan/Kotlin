package com.wx.kotlindemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textdemo = findViewById(R.id.text_demo) as TextView;
        textdemo.text = "Hello Kotlin"
    }

}
