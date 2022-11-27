package com.example.pia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Nuevo_proyecto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo_proyecto)
    }
    fun CancelarpOnClick(view: View){
        val i = Intent(this, Ingresar::class.java)
        startActivity(i)
    }
    fun CrearnuevopOnClick(view: View){
        val i = Intent(this, Proyectos::class.java)
        startActivity(i)
    }
}