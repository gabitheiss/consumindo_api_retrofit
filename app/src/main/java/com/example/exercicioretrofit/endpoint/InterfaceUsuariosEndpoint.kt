package com.example.exercicioretrofit.endpoint

import com.example.exercicioretrofit.model.Usuarios
import retrofit2.Call
import retrofit2.http.GET
import java.util.*

interface InterfaceUsuariosEndpoint {

    @GET("/users/1")
    fun buscarUsuarios() : Call<Usuarios>

}

