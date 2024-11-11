package com.example.superhero

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
//para la api token: Jeancharfan83/SuperHeroes
//paera la api dirección Jeancharfan83/SuperHeroes
// web https://superheroapi.com/
//Postman
//JSON Editor on line


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        }
    }
}