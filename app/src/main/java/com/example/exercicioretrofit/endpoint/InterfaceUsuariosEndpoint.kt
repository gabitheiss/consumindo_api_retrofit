package com.example.exercicioretrofit.endpoint

import com.example.exercicioretrofit.model.Auth
import com.example.exercicioretrofit.model.Credentials
import com.example.exercicioretrofit.model.Usuarios
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface InterfaceUsuariosEndpoint {

    @GET("/users/1")
    fun buscarUsuarios() : Call<Usuarios>

    @POST("/auth/login")
    fun login(@Body credentials: Credentials): Call<Auth>

}

