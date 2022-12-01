package com.example.pia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Ingresar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar)
    }
    fun PerfilOnClick(view: View){
        val i = Intent(this, Perfil::class.java)
        startActivity(i)
    }
    fun AgregarOnClick(view: View){
        val i = Intent(this, Nuevo_proyecto::class.java)
        startActivity(i)
    }
    fun SalirOnClick(view: View){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    fun VerproyectoOnClick(view: View){
        val i = Intent(this, Proyectos::class.java)
        startActivity(i)
    }

}