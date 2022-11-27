package com.example.pia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Proyectos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proyectos)
    }
    fun RegresaringOnClick(view: View){
        val i = Intent(this, Ingresar::class.java)
        startActivity(i)
    }
}