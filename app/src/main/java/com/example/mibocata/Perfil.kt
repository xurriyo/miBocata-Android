package com.example.mibocata

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Perfil : AppCompatActivity() {
    private lateinit var iconoinvoice: ImageView
    private lateinit var home: ImageView
    private lateinit var calendar: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.perfil)

        iconoinvoice = findViewById(R.id.invoceicono)
        home = findViewById(R.id.home)
        calendar = findViewById(R.id.iconocalendario)

        iconoinvoice.setOnClickListener {
            val intent = Intent(this, Invoice::class.java)
            startActivity(intent)
        }
        home.setOnClickListener {
            val intent = Intent(this, ElegirSandwich::class.java)
            startActivity(intent)
        }
        calendar.setOnClickListener {
            val intent = Intent(this, calendario::class.java)
            startActivity(intent)
        }
    }
}