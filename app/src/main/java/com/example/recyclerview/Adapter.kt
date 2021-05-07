package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.model.Animal

class Adapter(
    val context : Context,
    val listaDeAnimais : ArrayList<Animal>

) : RecyclerView.Adapter<ViewHolderAnimais>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAnimais {
        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.itens_da_lista, parent, false)
        return ViewHolderAnimais(view)
    }

    override fun onBindViewHolder(holder: ViewHolderAnimais, position: Int) {
        listaDeAnimais[position].also{
            holder.textView.text = it.especie
            holder.imageView.setImageResource(it.imagem)
        }
    }

    override fun getItemCount(): Int {
        return listaDeAnimais.size
    }
}

class ViewHolderAnimais(itemView: View) : RecyclerView.ViewHolder(itemView){
    var textView : TextView
    var imageView : ImageView

    init {
        textView = itemView.findViewById(R.id.textView)
        imageView = itemView.findViewById(R.id.imageView)
    }

}