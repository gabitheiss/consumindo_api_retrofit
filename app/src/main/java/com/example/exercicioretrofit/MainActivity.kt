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
           findViewById<TextView>(R.id.idUsername).text = this.username
           findViewById<TextView>(R.id.idPassword).text = this.password
           findViewById<TextView>(R.id.idFirstname).text = this.name.firstname
           findViewById<TextView>(R.id.idLastname).text = this.name.lastname
           findViewById<TextView>(R.id.idCity).text = this.address.city
           findViewById<TextView>(R.id.idStreet).text = this.address.street
           findViewById<TextView>(R.id.idNumber).text = this.address.number.toString()
           findViewById<TextView>(R.id.idZipcode).text = this.address.zipcode
           findViewById<TextView>(R.id.idLatitude).text = this.address.geolocation.lat
           findViewById<TextView>(R.id.idLongitude).text = this.address.geolocation.long
           findViewById<TextView>(R.id.idPhone).text = this.phone
       }
    }

    override fun onFailure(call: Call<Usuarios>, t: Throwable) {
        println("falhou")
    }
}



