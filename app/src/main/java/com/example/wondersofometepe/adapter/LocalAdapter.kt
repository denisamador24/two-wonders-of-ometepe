package com.example.wondersofometepe.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wondersofometepe.R
import com.example.wondersofometepe.data.Local

class LocalAdapter (val listLocals: List<Local>): RecyclerView.Adapter<LocalHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocalHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LocalHolder(layoutInflater.inflate(R.layout.card_list_local, parent, false))
    }

    override fun onBindViewHolder(holder: LocalHolder, position: Int) {
        val item = listLocals[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = listLocals.size
}