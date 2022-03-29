package com.oceanbrasil.ocean_android_introducao_29_03_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encontra o elemento btEnviar e armazena na variável btEnviar
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        // Cria um listener para o botão 'Enviar'
        btEnviar.setOnClickListener {
            // Esse código será executado quando acontecer um clique no botão
            tvResultado.text = "Paulo Salvatore"
        }
    }
}
