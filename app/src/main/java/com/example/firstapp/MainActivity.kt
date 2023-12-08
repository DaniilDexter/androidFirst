package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submit: Button = findViewById(R.id.submit)
        val h1: TextView = findViewById(R.id.h1)
        val email: EditText = findViewById(R.id.email)
        val mail: ImageView = findViewById(R.id.mail)
        val password: EditText = findViewById(R.id.password)
        val lock: ImageView = findViewById(R.id.lock)
        val enter: TextView = findViewById(R.id.enter)
        val description: TextView = findViewById(R.id.description)
        val services: LinearLayout = findViewById(R.id.services)
        val check: CheckBox = findViewById(R.id.lisence)

        submit.setOnClickListener{
            h1.visibility = View.GONE
            email.visibility = View.GONE
            mail.visibility = View.GONE
            password.visibility = View.GONE
            lock.visibility = View.GONE
            check.visibility = View.GONE
            enter.visibility = View.VISIBLE
            description.visibility = View.VISIBLE
            services.visibility = View.VISIBLE
            submit.setText(R.string.exit)
        }

    }
}