package com.example.wondersofometepe.adapter

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.wondersofometepe.InfoLocalActivity
import com.example.wondersofometepe.R
import com.example.wondersofometepe.data.Local

class LocalHolder(val view: View): RecyclerView.ViewHolder(view) {
    val name = view.findViewById<TextView>(R.id.cardlistLocal_name)
    val image = view.findViewById<ImageView>(R.id.cardListLocal_image)
    val card = view.findViewById<CardView>(R.id.cardListLocal)

    fun render(listLocalModel: Local){
        name.text = listLocalModel.name
        image.setImageResource(listLocalModel.fotoUri)

        card.setOnClickListener {
            val intent = Intent(view.context, InfoLocalActivity::class.java)
            intent.putExtra("name", listLocalModel.name)
            intent.putExtra("foto", listLocalModel.fotoUri)
            intent.putExtra("address", listLocalModel.address)
            intent.putExtra("phoneNumber", listLocalModel.cellNumber)
            intent.putExtra("description", listLocalModel.description)
            intent.putExtra("schedule", listLocalModel.schedule)
            intent.putExtra("email", listLocalModel.email)
            view.context.startActivity(intent)
        }
    }
}


