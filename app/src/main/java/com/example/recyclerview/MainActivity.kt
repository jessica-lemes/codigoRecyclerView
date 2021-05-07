package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.model.Animal

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView :RecyclerView
    lateinit var listaDeAnimais : ArrayList<Animal>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        carregarElementos()
        carregarArray()

        recyclerView.adapter = Adapter(this, listaDeAnimais)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
    fun carregarElementos(){
        recyclerView = findViewById(R.id.recycler)
    }

    fun carregarArray(){
        listaDeAnimais = ArrayList()
        listaDeAnimais.add(Animal("Cachorro", R.drawable.cachorro))
        listaDeAnimais.add(Animal("Gato", R.drawable.gato))
        listaDeAnimais.add(Animal("Porco", R.drawable.porco))
        listaDeAnimais.add(Animal("Passaro", R.drawable.passaro))
        listaDeAnimais.add(Animal("Leão", R.drawable.leao))
    }

}