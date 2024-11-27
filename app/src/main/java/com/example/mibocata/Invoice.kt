package com.example.mibocata

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import android.widget.ImageView
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Invoice : AppCompatActivity() {
    private lateinit var iconocalendario: ImageView
    private lateinit var iconousuario: ImageView
    private lateinit var logo_bocadillo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.invoice)

        val bocatas = listOf(
            Bocata(
                nombre = "Bocata de jamón serrano",
                precio = 3,
                dia = "Lunes",
                fecha = "2024-11-27",
                tipo = true,
                ingredientes = "Pan, jamón serrano, tomate",
                alergenos = "Gluten"
            ),
            Bocata(
                nombre = "Bocata de queso",
                precio = 2,
                dia = "Lunes",
                fecha = "2024-11-27",
                tipo = false,
                ingredientes = "Pan, queso manchego",
                alergenos = "Gluten, lácteos"
            ),
            Bocata(
                nombre = "Bocata vegetal",
                precio = 3,
                dia = "Martes",
                fecha = "2024-11-28",
                tipo = true,
                ingredientes = "Pan, lechuga, tomate, huevo",
                alergenos = "Gluten, huevo"
            ),
            Bocata(
                nombre = "Bocata de chorizo",
                precio = 2,
                dia = "Martes",
                fecha = "2024-11-28",
                tipo = false,
                ingredientes = "Pan, chorizo",
                alergenos = "Gluten"
            ),
            Bocata(
                nombre = "Bocata de pollo al curry",
                precio = 4,
                dia = "Miércoles",
                fecha = "2024-11-29",
                tipo = true,
                ingredientes = "Pan, pollo, curry, lechuga",
                alergenos = "Gluten"
            ),
            Bocata(
                nombre = "Bocata de atún",
                precio = 3,
                dia = "Miércoles",
                fecha = "2024-11-29",
                tipo = false,
                ingredientes = "Pan, atún, mayonesa",
                alergenos = "Gluten, huevo, pescado"
            ),
            Bocata(
                nombre = "Bocata de salmón ahumado",
                precio = 5,
                dia = "Jueves",
                fecha = "2024-11-30",
                tipo = true,
                ingredientes = "Pan, salmón, queso crema",
                alergenos = "Gluten, pescado, lácteos"
            ),
            Bocata(
                nombre = "Bocata de lomo adobado",
                precio = 4,
                dia = "Jueves",
                fecha = "2024-11-30",
                tipo = false,
                ingredientes = "Pan, lomo, pimientos",
                alergenos = "Gluten"
            ),
            Bocata(
                nombre = "Bocata de salchichón",
                precio = 2,
                dia = "Viernes",
                fecha = "2024-12-01",
                tipo = true,
                ingredientes = "Pan, salchichón",
                alergenos = "Gluten"
            ),
            Bocata(
                nombre = "Bocata de tortilla de patata",
                precio = 3,
                dia = "Viernes",
                fecha = "2024-12-01",
                tipo = false,
                ingredientes = "Pan, tortilla de patata",
                alergenos = "Gluten, huevo"
            )
        )

        iconocalendario = findViewById(R.id.iconocalendar)
        iconousuario = findViewById(R.id.iconouser)
        logo_bocadillo=findViewById(R.id.logo_bocadillo)

        iconocalendario.setOnClickListener {
            val intent = Intent(this, iconocalendario::class.java)
            startActivity(intent)
        }
        iconousuario.setOnClickListener {
            val intent = Intent(this, iconousuario::class.java)
            startActivity(intent)
        }
        logo_bocadillo.setOnClickListener{
            val intent= Intent (this, ElegirSandwich::class.java)
            startActivity(intent)
        }

        val gridView = findViewById<GridView>(R.id.gridviewpocho)
        val adapter = AdaptadorBocata(this, bocatas )

        gridView.adapter = adapter
    }
}