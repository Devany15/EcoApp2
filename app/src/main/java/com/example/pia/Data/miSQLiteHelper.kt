package com.example.pia.Data

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class miSQLiteHelper (context: Context): SQLiteOpenHelper(context, "EcoApp", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        val ordenCreacion = "CREATE TABLE Users" +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT," +
                "lastname TEXT, " +
                "email TEXT, " +
                "password TEXT, " +
                "type TEXT)"
        db!!.execSQL(ordenCreacion)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val ordenBorrado = "DROP TABLE IF EXISTS Users"
        db!!.execSQL(ordenBorrado)
        onCreate(db)
    }

    fun insert(name: String, lastname: String, email: String, password: String, type:String){
        val datos = ContentValues()
        datos.put("name", name)
        datos.put("lastname", lastname)
        datos.put("email", email)
        datos.put("password", password)
        datos.put("type", type)

        val db = this.writableDatabase
        db.insert("Users", null, datos)
        db.close()
    }
}