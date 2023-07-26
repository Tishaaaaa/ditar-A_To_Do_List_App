package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNext = findViewById<Button>(R.id.Next)
    btnNext.setOnClickListener    {
        val intent = Intent(this, secondactivity::class.java)
        startActivity(intent)
    }
        val tvmytextview = findViewById<TextView>(R.id.textView)
Toast.makeText(this,"Welcome!",  Toast.LENGTH_SHORT).show()

    }

}