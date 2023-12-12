package com.projeto.impactplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CadastroAtividade : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_atividade)

        val btnEnviar = findViewById<Button>(R.id.btn_enviar)

        btnEnviar.setOnClickListener{
            val i = Intent(this, Parabens::class.java)
            startActivity(i)
        }
    }
}