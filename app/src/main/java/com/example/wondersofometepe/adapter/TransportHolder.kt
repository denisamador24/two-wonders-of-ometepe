package com.example.wondersofometepe.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.wondersofometepe.InfoBusBarcoActivity
import com.example.wondersofometepe.InfoTaxiActivity
import com.example.wondersofometepe.R
import com.example.wondersofometepe.data.Driver
import com.example.wondersofometepe.data.Transport

class TransportHolder(val view: View): RecyclerView.ViewHolder(view) {

    val card = view.findViewById<CardView>(R.id.cardListTransport)
    val image = view.findViewById<ImageView>(R.id.cardListTransport_imageView)
    val route = view.findViewById<TextView>(R.id.cardListTransport_route)
    val price = view.findViewById<TextView>(R.id.cardListTransport_price)
    val schule = view.findViewById<TextView>(R.id.cardListTransport_schule)

    @SuppressLint("SetTextI18n")
    fun render(item: Transport, category: Int){
        image.setImageResource(item.fotoUri)
        route.text = item.route
        if (item.rangePrice.two != null){
            price.text = item.rangePrice.one.toString() + " a "+ item.rangePrice.two.toString()
        } else {
            price.text = item.rangePrice.one.toString()
        }
        schule.text = item.schedule

        card.setOnClickListener {
            if (category == 1){
                val intent = Intent(view.context, InfoTaxiActivity::class.java)
                intent.putExtra("fotoUri", item.fotoUri)
                intent.putExtra("schedule", item.schedule)
                intent.putExtra("route", item.route)
                intent.putExtra("maxP", item.maxPassenger)
                intent.putExtra("price", price.text)
                intent.putExtra("license", item.licese)
                intent.putExtra("description", item.description)
                intent.putExtra("nameDriver", item.driver?.name)
                intent.putExtra("cellNumberDriver", item.driver?.cellNumber)
                intent.putExtra("foto", item.driver?.fotoUri)
                view.context.startActivity(intent)
            } else if (category == 2){
                val intent = Intent(view.context, InfoBusBarcoActivity::class.java)
                intent.putExtra("fotoUri", item.fotoUri)
                intent.putExtra("schedule", item.schedule)
                intent.putExtra("route", item.route)
                intent.putExtra("maxP", item.maxPassenger)
                intent.putExtra("price", price.text)
                intent.putExtra("license", item.licese)
                intent.putExtra("description", item.description)
                view.context.startActivity(intent)
            }
        }
    }
}