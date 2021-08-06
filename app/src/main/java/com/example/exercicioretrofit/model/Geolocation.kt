package com.example.exercicioretrofit.model

import com.google.gson.annotations.SerializedName

data class Geolocation(
    @SerializedName("lat") val lat: String,
    @SerializedName("long") val long : String
)
