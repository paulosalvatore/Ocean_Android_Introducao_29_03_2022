package com.oceanbrasil.ocean_android_introducao_29_03_2022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Encontra o elemento btEnviar e armazena na variável btEnviar
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val etNome = findViewById<EditText>(R.id.etNome)

        // Cria um listener para o botão 'Enviar'
        btEnviar.setOnClickListener {
            // Caso o texto que está no etNome não esteja em branco, executa o primeiro bloco
            if (etNome.text.isNotBlank()) {
                // Esse código será executado quando acontecer um clique no botão
                tvResultado.text = etNome.text
            // Caso contrário, se o etNome estiver em branco, executa o segundo bloco
            } else {
                // Exibe uma mensagem de erro
                etNome.error = "Digite um nome válido"
            }
        }
    }
}
