package com.example.exercicioretrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.exercicioretrofit.endpoint.Retrofit
import com.example.exercicioretrofit.model.Auth
import com.example.exercicioretrofit.model.Credentials
import com.example.exercicioretrofit.model.Usuarios
import org.w3c.dom.Text
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivityLogin : AppCompatActivity(), Callback<Auth> {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonLogin).setOnClickListener {
        val credentials = Credentials(findViewById(R.id.textLogin), findViewById(R.id.textSenha))

            val carregar = Retrofit.criarUsuarios()
            val call = carregar.login(credentials)

            carregar.enqueue(this)
        }

    }

    override fun onResponse(call: Call<Auth>, response: Response<Auth>) {
        val it = Intent(this, MainActivity::class.java)
        startActivity(it)
    }

    override fun onFailure(call: Call<Auth>, t: Throwable) {
        println("falhou")
    }
}



