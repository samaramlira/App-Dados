package com.example.appdados2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DadosActivity : AppCompatActivity() {
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

        val imageResource = imgD6(valor)
        val imageDado = findViewById<ImageView>(R.id.imageDado)
        imageDado.setImageResource(imageResource)

    }

    private fun imgD6(valor: Int): Int {
                return when (valor) {
                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }
            }
}