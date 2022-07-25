package com.example.appdados2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)
        val buttonD12 = findViewById<Button>(R.id.buttonD12)
        val buttonD20 = findViewById<Button>(R.id.buttonD20)

        val videoDado = findViewById<VideoView>(R.id.videoDado)
        videoDado.setVideoPath("android.resourse://"+getPackageName()+"/"+R.raw.gif_dados)

        val intentDados = Intent(this, DadosActivity::class.java)
        val intentDados12 = Intent(this, Dados12Activity::class.java)
        val intentDados20 = Intent(this, Dados20Activity::class.java)

        buttonD6.setOnClickListener {
            intentDados.putExtra("LADOS", 6)
            startActivity(intentDados)
        }
        buttonD12.setOnClickListener {
            intentDados12.putExtra("LADOS", 12)
            startActivity(intentDados12)
        }
        buttonD20.setOnClickListener {
            intentDados20.putExtra("LADOS", 20)
            startActivity(intentDados20)
        }



    }
}