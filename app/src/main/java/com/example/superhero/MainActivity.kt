package com.example.superhero

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.superhero.utils.RetrofitProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//para la api token: Jeancharfan83/SuperHeroes
//paera la api dirección Jeancharfan83/SuperHeroes
// web https://superheroapi.com/
//Postman
//JSON Editor on line
//ver RETROFIT


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val service = RetrofitProvider.getRetrofit()


        CoroutineScope(Dispatchers.IO).launch {
            val result = service.findSuperheroesByName("super")
            println(result)
        }
    }
}