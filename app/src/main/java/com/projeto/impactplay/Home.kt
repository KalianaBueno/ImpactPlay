package com.projeto.impactplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnCadastroAtividade = findViewById<Button>(R.id.btn_desafio)

        btnCadastroAtividade.setOnClickListener{
            val i = Intent(this, CadastroAtividade::class.java)
            startActivity(i)
        }
    }
}