package com.example.mibocata

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ElegirSandwich : AppCompatActivity() {

    private lateinit var invoice2: ImageView
    private lateinit var userIcon: ImageView
    private lateinit var calendar: ImageView

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eleccion_sanwi)

        invoice2= findViewById(R.id.icono3)
        userIcon= findViewById(R.id.icono2)
        calendar= findViewById(R.id.Icono1)

        invoice2.setOnClickListener{
            val intent = Intent(this,invoice2::class.java)
            startActivity(intent)
        }
        userIcon.setOnClickListener{
            val intent=Intent(this,userIcon::class.java)
            startActivity(intent)
        }
        calendar.setOnClickListener {
            val intent= Intent(this,calendar::class.java)
            startActivity(intent)
        }
    }
}