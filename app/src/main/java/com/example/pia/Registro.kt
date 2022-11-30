package com.example.pia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.pia.Data.miSQLiteHelper
import com.example.pia.databinding.ActivityRegistroBinding
import java.sql.PreparedStatement
import java.sql.SQLException


class Registro : AppCompatActivity() {

    lateinit var amigosDBHelper: miSQLiteHelper

    override fun onCreate(savedInstanceState: Bundle?) {

        amigosDBHelper = miSQLiteHelper(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        var BtnCrear = findViewById<Button>(R.id.btn_crear)
        var Uname = findViewById<EditText>(R.id.Name)
        var Ulastname = findViewById<EditText>(R.id.LastName)
        var Uemail = findViewById<EditText>(R.id.Email)
        var Upassword = findViewById<EditText>(R.id.Password)

        BtnCrear.setOnClickListener {
            if (Uname.text.isNotEmpty() && Ulastname.text.isNotEmpty() && Uemail.text.isNotEmpty() && Upassword.text.isNotEmpty()) {
                amigosDBHelper.insert(
                    Uname.text.toString(),
                    Ulastname.text.toString(),
                    Uemail.text.toString(),
                    Uemail.text.toString(),
                    "user"
                )
                Toast.makeText(this, "Usuario Creado", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(
                    this, "No se ha podido guardar",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}