package com.example.exercicioretrofit.model

import com.google.gson.annotations.SerializedName

data class Auth(
    @SerializedName("token")  val token: String
)
