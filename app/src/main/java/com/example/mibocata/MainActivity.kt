package com.example.mibocata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var boton_login: Button
    private lateinit var usuario: EditText
    private lateinit var password: EditText
    private lateinit var usuario_text: String
    private lateinit var password_text: String

    private var usuario_prueba="Christian"
    private var password_prueba="123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usuario= findViewById(R.id.usuario)
        password= findViewById(R.id.password)
        boton_login=findViewById(R.id.boton_login)

        boton_login.setOnClickListener {
            usuario_text=usuario.text.toString()
            password_text=password.text.toString()

            if (usuario_text.isBlank() || password_text.isBlank()){
                Toast.makeText(this, "Las credenciales son incorrectas", Toast.LENGTH_SHORT).show()
            }else if (usuario_text==usuario_prueba || password_text==password_prueba){
                val intent= Intent(this, ElegirSandwich::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this, "Contraseña o Usuario erroneos", Toast.LENGTH_SHORT).show()
            }
        }

        }
    }