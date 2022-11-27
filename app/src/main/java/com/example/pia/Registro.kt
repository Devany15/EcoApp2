package com.example.pia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.pia.databinding.ActivityRegistroBinding
import java.sql.PreparedStatement
import java.sql.SQLException


class Registro : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding

    private  var connectSql= ConnectSql()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCrear.setOnClickListener{
            registrarUsuario()
            binding.name.text.clear()
            binding.LastName.text.clear()
            binding.Email.text.clear()
            binding.Password.text.clear()
        }


    }

    fun CancelarOnClick(view: View){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    fun CrearOnClick(view: View){
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }

    fun registrarUsuario(){
        try {
            val usuario:PreparedStatement = connectSql.dbConn()?.prepareStatement("insert int Usuarios values (?,?)")!!
            usuario.setString( 1,binding.name.text.toString())
            usuario.setString(2,binding.LastName.text.toString())
            usuario.setString(3,binding.Email.text.toString())
            usuario.setString(4,binding.Password.text.toString())
            usuario.executeUpdate();
            Toast.makeText(this,"REGISTRO AGREGADO CORRECTAMENTE",Toast.LENGTH_SHORT).show()

        }catch(ex: SQLException){
            Toast.makeText(this,"REGISTRO NO INSERTADO",Toast.LENGTH_SHORT).show()

        }

    }
}