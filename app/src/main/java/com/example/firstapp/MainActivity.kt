package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.submit_button)
        val mytext: TextView = findViewById(R.id.first_text)

        myButton.setOnClickListener{
            mytext.setText(R.string.app_name)
        }

    }
}