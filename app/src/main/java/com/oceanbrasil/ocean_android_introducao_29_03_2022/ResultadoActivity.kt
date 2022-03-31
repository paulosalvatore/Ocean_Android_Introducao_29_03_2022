package com.oceanbrasil.ocean_android_introducao_29_03_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nomeDigitado = intent.getStringExtra("NOME_DIGITADO")

        val tvNome = findViewById<TextView>(R.id.tvNome)
        tvNome.text = nomeDigitado
    }
}
