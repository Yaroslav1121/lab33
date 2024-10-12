package com.example.lab33

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val infoTextView = findViewById<TextView>(R.id.infoTextView)
        val infoType = intent.getStringExtra("infoType")

        when (infoType) {
            "author" -> infoTextView.text = "Автор додатку: Климік Ярослав"
            "faculty" -> infoTextView.text = "Факультет: ФІТ"
            "city" -> infoTextView.text = "Місто: Миколаїв"
        }
        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()  // Завершує другу активність і повертається до першої
        }
    }
}
