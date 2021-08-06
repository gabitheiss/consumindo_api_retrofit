package com.example.exercicioretrofit.endpoint

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit {

    private  val retrofit = Retrofit.Builder()
        .baseUrl("https://fakestoreapi.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun criarUsuarios() :  InterfaceUsuariosEndpoint {
        return retrofit.create(InterfaceUsuariosEndpoint::class.java)
    }
}