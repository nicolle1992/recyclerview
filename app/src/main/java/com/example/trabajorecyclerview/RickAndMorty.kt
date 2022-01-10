package com.example.trabajorecyclerview

import com.google.gson.annotations.SerializedName

data class RickAndMorty(
    @SerializedName("id") val id:Int,
    @SerializedName("name") val name:String,
    @SerializedName("image") val image: String
)
