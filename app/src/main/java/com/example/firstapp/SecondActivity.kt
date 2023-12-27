package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity()  {
    private lateinit var ret: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val submit: Button = findViewById(R.id.retur)
        ret = findViewById(R.id.new_text)

        ret.text = intent.getStringExtra(FIO)

        submit.setOnClickListener {
            startFirst()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(SAVED_STRING, ret.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        val saved = savedInstanceState.getString(SAVED_STRING)
        ret.text = saved
    }

    private fun startFirst() {
        startActivity(
            Intent(this, MainActivity::class.java)
        )
    }

    companion object {
        private const val SAVED_STRING = "SAVED_STRING"
        private const val FIO = "FIO"
    }
}