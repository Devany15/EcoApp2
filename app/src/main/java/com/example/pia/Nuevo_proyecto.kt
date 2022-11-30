package com.example.pia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Nuevo_proyecto : AppCompatActivity() {
    lateinit var nProyecto:EditText
    lateinit var catProy:EditText
    lateinit var cantProy:EditText
    lateinit var dateProy:EditText
    lateinit var descProy:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevo_proyecto)
        nProyecto=findViewById(R.id.nProyecto)
        catProy=findViewById(R.id.catProy)
        cantProy=findViewById(R.id.cantProy)
        dateProy=findViewById(R.id.dateProy)
        descProy=findViewById(R.id.dateProy)
    }
    fun CancelarpOnClick(view: View){
        val i = Intent(this, Ingresar::class.java)
        startActivity(i)
    }
    fun CrearnuevopOnClick(view: View){
        if(nProyecto.text.toString().length==0)
            Toast.makeText(this, "Datos incompletos", Toast.LENGTH_SHORT).show()
        else{
            if(catProy.text.toString().length==0)
                Toast.makeText(this, "Datos incompletos", Toast.LENGTH_SHORT).show()
            else{
                if(cantProy.text.toString().length==0)
                    Toast.makeText(this, "Datos incompletos", Toast.LENGTH_SHORT).show()
                else{
                    if(dateProy.text.toString().length==0)
                        Toast.makeText(this, "Datos incompletos", Toast.LENGTH_SHORT).show()
                    else{
                        if(descProy.text.toString().length==0)
                            Toast.makeText(this, "Datos incompletos", Toast.LENGTH_SHORT).show()
                        else{
                            val i = Intent(this, Proyectos::class.java)
                            startActivity(i)
                        }
                    }
                }
            }

        }
    }
}