package com.example.appdados2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Dados12Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        val lados = intent.getIntExtra("LADOS", 6)

        val textTituloD6 = findViewById<TextView>(R.id.textTituloD6)
        val textResultado = findViewById<TextView>(R.id.textResultado)
        val buttonRolar = findViewById<Button>(R.id.buttonRolar)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

        textResultado.text = "D$lados"

        buttonRolar.setOnClickListener {
            rolarDados(lados)
        }
        buttonVoltar.setOnClickListener {
            finish()
        }
    }

    private fun rolarDados(lados: Int) {
        val valor = (1..lados).random()

        val textResultado = findViewById<TextView>(R.id.textResultado)
        textResultado.text = valor.toString()

        val imageResource = imgD12(valor)
        val imageDado = findViewById<ImageView>(R.id.imageDado)
        imageDado.setImageResource(imageResource)

    }

    private fun imgD12(valor: Int): Int {
        return when (valor) {
            1 -> R.drawable.dado_1
            2 -> R.drawable.dado_2
            3 -> R.drawable.dado_3
            4 -> R.drawable.dado_4
            5 -> R.drawable.dado_5
            6 -> R.drawable.dado_6
            7 -> R.drawable.dado_7
            8 -> R.drawable.dado_8
            11 -> R.drawable.dado_9
            10 -> R.drawable.dado_10
            11 -> R.drawable.dado_11
            else -> R.drawable.dado_12
        }
    }

}