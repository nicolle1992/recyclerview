package com.example.trabajorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var rickList: List<RickAndMorty>
    lateinit var recyrclerView:RecyclerView
    lateinit var rickAdapter: RickAdapter

    private var morthyList = listOf("pedro","antonia","juan","ivan","roberto")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rickList = ArrayList()
        recyrclerView = findViewById(R.id.rv)
        recyrclerView.layoutManager = LinearLayoutManager(applicationContext)
    }

    fun run(){
        val call = getRetrofit().create(APIService::class.java).getRick("character").execute().body()
    }


    fun getRetrofit(): Retrofit{
        return Retrofit.Builder().baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

}

