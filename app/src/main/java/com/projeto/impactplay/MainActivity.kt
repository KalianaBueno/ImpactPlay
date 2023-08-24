package com.projeto.impactplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnColaborador = findViewById<Button>(R.id.btn_colaborador)
        val btnAdm = findViewById<Button>(R.id.btn_adm)

        btnColaborador.setOnClickListener{
            val i = Intent(this, Login::class.java)
            startActivity(i)
        }

        btnAdm.setOnClickListener{
            val i = Intent(this, Login::class.java)
            startActivity(i)
        }
    }
}