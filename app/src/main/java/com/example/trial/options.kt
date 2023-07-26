package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class options : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.title = "DITAR"
            actionBar.setDisplayHomeAsUpEnabled(true)
            val btnbutton2 = findViewById<Button>(R.id.button2)
            btnbutton2.setOnClickListener {
                val intent = Intent(this, todo::class.java)
                startActivity(intent)
            }
            val btnbutton3 = findViewById<Button>(R.id.button3)
             btnbutton3.setOnClickListener {
                val intent = Intent(this, thought_dump::class.java)
                startActivity(intent)
            }
            val btnbutton4 = findViewById<Button>(R.id.button4)
             btnbutton4.setOnClickListener {
                val intent = Intent(this, Mindfulness ::class.java)
                startActivity(intent)
            }
            val btnbutton5 = findViewById<Button>(R.id.button5)
             btnbutton5.setOnClickListener {
                val intent = Intent(this, secondactivity::class.java)
                startActivity(intent)
            }
        }
    }
}