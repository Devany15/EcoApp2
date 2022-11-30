package com.example.pia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edtUsuario:EditText
    lateinit var edtContra:EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtUsuario=findViewById(R.id.edtUsuario)
        edtContra=findViewById(R.id.edtContra)
    }

    fun RegistroOnClick(view: View){
        val i = Intent(this, Registro::class.java)
        startActivity(i)
    }
    fun IngresarOnClick(view: View){
        if(edtContra.text.toString().length==0)
            Toast.makeText(this, "Datos incompletos", Toast.LENGTH_SHORT).show()
        else{
            if(edtUsuario.text.toString().length==0)
                Toast.makeText(this, "Datos incompletos", Toast.LENGTH_SHORT).show()
            else{
                val i = Intent(this, Ingresar::class.java)
                startActivity(i)
            }
        }

    }
}