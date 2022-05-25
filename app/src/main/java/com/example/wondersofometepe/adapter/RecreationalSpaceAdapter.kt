package com.example.wondersofometepe.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wondersofometepe.R
import com.example.wondersofometepe.data.RecreationalSpace

class RecreationalSpaceAdapter(val listSpace: List<RecreationalSpace>): RecyclerView.Adapter<RecreationalSpaceHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecreationalSpaceHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return RecreationalSpaceHolder(layoutInflater.inflate(R.layout.card_list_local, parent, false))
    }

    override fun onBindViewHolder(holder: RecreationalSpaceHolder, position: Int) {
        holder.render(listSpace[position])
    }

    override fun getItemCount(): Int = listSpace.size

}