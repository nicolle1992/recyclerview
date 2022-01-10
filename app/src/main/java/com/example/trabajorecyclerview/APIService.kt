package com.example.trabajorecyclerview

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET("character")
  suspend fun getRick():Call<List<RickAndMorty>>
    // llamada a Endpoint
    // llamada a Json
    Character
}