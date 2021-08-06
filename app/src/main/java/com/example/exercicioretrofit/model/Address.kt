package com.example.exercicioretrofit.model

import com.google.gson.annotations.SerializedName

data class Address(
     @SerializedName("city")  val city: String,
     @SerializedName("street") val street: String,
     @SerializedName("number") val number: Int,
     @SerializedName("zipcode") val zipcode: String,
     @SerializedName("geolocation") val geolocation: Geolocation,

)
