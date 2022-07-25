package com.example.appdados2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Dados20Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        val lados = intent.getIntExtra("LADOS", 6)

        val textTituloD6 = findViewById<TextView>(R.id.textTituloD6)
        val textResultado = findViewById<TextView>(R.id.textResultado)
        val buttonRolar = findViewById<Button>(R.id.buttonRolar)
        val buttonVoltar = findViewById<Button>(R.id.buttonVoltar)

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

        val imageResource = imgD20(valor)
        val imageDado = findViewById<ImageView>(R.id.imageDado)
        imageDado.setImageResource(imageResource)

    }
    private fun imgD20(valor: Int): Int {
                return when (valor) {
                    1 -> R.drawable.d20_1
                    2 -> R.drawable.d20_2
                    3 -> R.drawable.d20_3
                    4 -> R.drawable.d20_4
                    5 -> R.drawable.d20_5
                    6 -> R.drawable.d20_6
                    7 -> R.drawable.d20_7
                    8 -> R.drawable.d20_8
                    9 -> R.drawable.d20_9
                    10 -> R.drawable.d20_10
                    11 -> R.drawable.d20_11
                    12 -> R.drawable.d20_12
                    13 -> R.drawable.d20_13
                    14 -> R.drawable.d20_14
                    15 -> R.drawable.d20_15
                    16 -> R.drawable.d20_16
                    17 -> R.drawable.d20_17
                    18 -> R.drawable.d20_18
                    19 -> R.drawable.d20_19
                    else -> R.drawable.d20_20
                }
            }
}