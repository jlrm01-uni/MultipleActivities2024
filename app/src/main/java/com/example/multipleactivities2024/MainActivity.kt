package com.example.multipleactivities2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.window.OnBackInvokedDispatcher

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.goToActivity2Button)

        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }
    }

}