package com.example.wondersofometepe.adapter

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.wondersofometepe.InfoLocalActivity
import com.example.wondersofometepe.InfoSpaceActivity
import com.example.wondersofometepe.R
import com.example.wondersofometepe.data.RecreationalSpace

class RecreationalSpaceHolder(val view: View): RecyclerView.ViewHolder(view) {

    val cardView = view.findViewById<CardView>(R.id.cardListLocal)
    val name = view.findViewById<TextView>(R.id.cardlistLocal_name)
    val image = view.findViewById<ImageView>(R.id.cardListLocal_image)

    fun render (item: RecreationalSpace){
        name.text = item.name
        image.setImageResource(item.UriFoto)

        cardView.setOnClickListener {
            val intent = Intent(view.context, InfoSpaceActivity::class.java)
            intent.putExtra("name", item.name)
            intent.putExtra("imageUri",item.UriFoto)
            intent.putExtra("adress", item.adress)
            intent.putExtra("description", item.description)
            view.context.startActivity(intent)
        }
    }
}