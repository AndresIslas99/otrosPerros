package com.example.perros.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.perros.R

class PerrosAdapter(private val imagenes:List<String>): RecyclerView.Adapter<PerrosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PerrosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PerrosViewHolder(layoutInflater.inflate(R.layout.perro_renglon, parent,false))
    }

    override fun onBindViewHolder(holder: PerrosViewHolder, position: Int) {
        val perroUrl = imagenes[position]
        holder.bind(perroUrl)
    }

    override fun getItemCount(): Int {
        return imagenes.size
    }
}