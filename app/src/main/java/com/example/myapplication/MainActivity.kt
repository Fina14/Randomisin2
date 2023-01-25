package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
    }
    fun dado (view: View) {
        val intent = Intent(this, DadoActivity::class.java)
        startActivity(intent)
    }
    fun moneda (view: View) {
        val intent = Intent(this, MonedaActivity::class.java)
        startActivity(intent)
    }
}