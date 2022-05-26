package com.example.wondersofometepe.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wondersofometepe.R
import com.example.wondersofometepe.data.Transport

class TransportAdapter(val listTransport: List<Transport>, val category: Int): RecyclerView.Adapter<TransportHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransportHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return TransportHolder(layoutInflater.inflate(R.layout.card_list_transport, parent, false))
    }

    override fun onBindViewHolder(holder: TransportHolder, position: Int) {
        holder.render(listTransport[position], category)
    }

    override fun getItemCount(): Int = listTransport.size
}