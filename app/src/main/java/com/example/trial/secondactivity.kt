package com.example.trial

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        val actionBar= supportActionBar
        if (actionBar != null){
            actionBar.title= "DITAR"
            actionBar.setDisplayHomeAsUpEnabled(true)
            val btnbutton = findViewById<Button>(R.id.button)
            btnbutton.setOnClickListener {
                btnbutton.text ="When you know better, you do better."
                val btnNext1 = findViewById<Button>(R.id.button)
                btnNext1.setOnClickListener    {
                    val intent = Intent(this, options::class.java)
                    startActivity(intent)
            }
        }
    }
}
}