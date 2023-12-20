package com.example.firstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var fio: EditText
    private lateinit var iphone: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submit: Button = findViewById(R.id.submit)
        val phone: Button = findViewById(R.id.phone)
        fio = findViewById(R.id.email)
        iphone = findViewById(R.id.password)

        submit.setOnClickListener {
            startSecond()
        }

        phone.setOnClickListener {
            dialNumber()
        }
    }

    private fun startSecond() {
        intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("FIO", fio.text.toString())
        startActivity(intent)
    }

    private fun dialNumber() {
        val intent = Intent(Intent.ACTION_DIAL).apply {
            data = Uri.parse("tel:" + iphone.text.toString())
        }
        startActivity(intent)
    }

}
