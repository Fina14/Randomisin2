@file:Suppress("UNUSED_PARAMETER")

package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import java.util.*


class MonedaActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private val aleatorio = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moneda)

        imageView = findViewById(R.id.imagen_moneda)

    }
    fun tirarmoneda(view: View) {
        when (aleatorio.nextInt(2) + 1) {
            1 -> imageView.setImageResource(R.drawable.m1)
            2 -> imageView.setImageResource(R.drawable.face)

    }
}
}