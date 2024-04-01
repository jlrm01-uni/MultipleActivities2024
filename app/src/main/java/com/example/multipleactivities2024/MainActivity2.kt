package com.example.multipleactivities2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.window.OnBackInvokedDispatcher

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button = findViewById<Button>(R.id.goBackToMainButton)

        button.setOnClickListener {
            finish()
        }
    }

}