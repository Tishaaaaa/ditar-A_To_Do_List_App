package com.example.trial

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Mindfulness : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mindfulness)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.title = "Mindfulness Corner"
            actionBar.setDisplayHomeAsUpEnabled(true)
            val TextView = findViewById<TextView>(R.id.TV1)
            val btnyt1 = findViewById<Button>(R.id.yt1)
            btnyt1.setOnClickListener {
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://www.youtube.com/watch?v=4pLUleLdwY4")
                startActivity(openURL)
                val TextView = findViewById<TextView>(R.id.TV2)
                val btnyt2 = findViewById<Button>(R.id.yt2)
                btnyt2.setOnClickListener {
                    val openURL = Intent(android.content.Intent.ACTION_VIEW)
                    openURL.data = Uri.parse("https://www.youtube.com/watch?v=CIxNJbit9BA")
                    startActivity(openURL)
                    val TextView = findViewById<TextView>(R.id.TV3)
                    val btnyt3 = findViewById<Button>(R.id.yt3)
                    btnyt3.setOnClickListener {
                        val openURL = Intent(android.content.Intent.ACTION_VIEW)
                        openURL.data = Uri.parse("https://www.youtube.com/watch?v=gfDE2a7MKjA")
                        startActivity(openURL)
                    }
                }

            }
        }
    }
}

