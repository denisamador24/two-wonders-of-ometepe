package com.example.wondersofometepe.data

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.wondersofometepe.InfoLocalActivity
import com.example.wondersofometepe.R

class LocalHolder(val view: View): RecyclerView.ViewHolder(view) {
    val name = view.findViewById<TextView>(R.id.cardlistLocal_name)
    val image = view.findViewById<ImageView>(R.id.cardListLocal_image)
    val card = view.findViewById<CardView>(R.id.cardListLocal)

    fun render(listLocalModel: Local){
        name.text = listLocalModel.name
        image.setImageResource(listLocalModel.foto)

        card.setOnClickListener {
            val intent = Intent(view.context, InfoLocalActivity::class.java)
            view.context.startActivity(intent)
        }
    }
}


