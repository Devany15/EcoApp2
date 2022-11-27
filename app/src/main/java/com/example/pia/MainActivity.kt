package com.example.pia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatViewInflater

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun RegistroOnClick(view: View){
        val i = Intent(this, Registro::class.java)
        startActivity(i)
    }
    fun IngresarOnClick(view: View){
        val i = Intent(this, Ingresar::class.java)
        startActivity(i)
    }
}