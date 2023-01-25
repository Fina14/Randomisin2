package com.example.myapplication


import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random


class DadoActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private val aleatorio = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dado)

        imageView = findViewById(R.id.imageView2)

    }
    fun tirardados(view: View) {
        when (aleatorio.nextInt(6) + 1) {
            1 -> imageView.setImageResource(R.drawable._1)
            2 -> imageView.setImageResource(R.drawable._2)
            3 -> imageView.setImageResource(R.drawable._3)
            4 -> imageView.setImageResource(R.drawable._4)
            5 -> imageView.setImageResource(R.drawable._5)
            6 -> imageView.setImageResource(R.drawable._6)
        }
    }
}