package com.example.exercicioretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.exercicioretrofit.endpoint.Retrofit
import com.example.exercicioretrofit.model.Usuarios
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<Usuarios> {

    val call by lazy {
        val carregar = Retrofit.criarUsuarios()
        carregar.buscarUsuarios()

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela_usuarios_retorno)

        call.enqueue(this)
    }

    override fun onResponse(call: Call<Usuarios>, response: Response<Usuarios>) {
       response.body()?.apply {
           findViewById<TextView>(R.id.idId).text = this.idUser.toString()
           findViewById<TextView>(R.id.idEmail).text = this.email

       }
    }

    override fun onFailure(call: Call<Usuarios>, t: Throwable) {
        println("falhou")
    }
}



