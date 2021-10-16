package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var counter=26
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text=findViewById<TextView>(R.id.textView2)
        var btn=findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            counter++

            text.text= counter.toString()

        }
    }
}