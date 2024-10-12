package com.example.lab33

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)

        button1.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("infoType", "author")
            startActivity(intent)
        }

        button2.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("infoType", "faculty")
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("infoType", "city")
            startActivity(intent)
        }
    }
}
