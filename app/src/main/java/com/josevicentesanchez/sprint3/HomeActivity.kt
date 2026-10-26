package com.josevicentesanchez.sprint3

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class HomeActivity : ComponentActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            Toast.makeText(
                this,
                "Todavía no implementado.",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}