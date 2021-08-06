package com.example.exercicioretrofit.model

import android.provider.ContactsContract
import com.google.gson.annotations.SerializedName

data class Usuarios(
    //SerializesName usa somente quando quero mudar o nome (variavel) diferente do que vem na api
    @SerializedName("id")  val idUser: Int,
     val email: String,
     val username: String,
     val password: String,
     val name: Name,
     val address: Address,
     val phone: String

)


