package com.example.ejerciciolayout4

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Establece el diseño de la actividad usando el archivo XML `activity_main2`.
        setContentView(R.layout.activity_main2)

        // Obtiene una referencia al ConstraintLayout principal mediante su ID en el archivo XML.
        val mainLayout = findViewById<ConstraintLayout>(R.id.main_layout)

        // Obtiene una referencia al botón que cambiará el color de fondo del layout.
        val cambiarColorBoton = findViewById<Button>(R.id.cambiarColorBoton)

        // Configura un listener para detectar clics en el botón.
        cambiarColorBoton.setOnClickListener {
            // Genera un color aleatorio usando valores RGB, generando un número aleatorio 0 y 255.
            val randomColor = Color.rgb(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256)
            )
            // Cambia el color de fondo del ConstraintLayout principal al color aleatorio generado.
            mainLayout.setBackgroundColor(randomColor)
        }
    }
}
