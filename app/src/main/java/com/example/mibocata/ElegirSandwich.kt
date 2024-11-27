package com.example.mibocata

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ElegirSandwich : AppCompatActivity() {

    private lateinit var invoice2: ImageView
    private lateinit var userIcon: ImageView
    private lateinit var calendar: ImageView
    private lateinit var contenedor_caliente: View
    private lateinit var panel_frio: View

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eleccion_sanwi)

        invoice2= findViewById(R.id.icono3)
        userIcon= findViewById(R.id.icono2)
        calendar= findViewById(R.id.Icono1)
        contenedor_caliente= findViewById(R.id.panel_caliente)
        panel_frio= findViewById(R.id.panel_frio)

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
        contenedor_caliente.setOnClickListener{
            Toast.makeText(this, "Tu pedido se ha recibido en cocina", Toast.LENGTH_SHORT).show()
        }
        panel_frio.setOnClickListener{
            Toast.makeText(this, "Tu pedido se ha recibido en cocina", Toast.LENGTH_SHORT).show()
        }

    }
}