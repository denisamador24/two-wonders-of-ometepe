package com.example.wondersofometepe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class InfoBusBarcoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_bus_barco)

        val foto = intent.getIntExtra("fotoUri", R.drawable.img_bus_ometepe)
        val schedule = intent.getStringExtra("schedule")
        val route = intent.getStringExtra("route")
        val maxP = intent.getStringExtra("maxP")
        val price = intent.getStringExtra("price")
        val license = intent.getStringExtra("license")
        val description = intent.getStringExtra("description")

        val viewRoute = findViewById<TextView>(R.id.activityInfoBusBarco_route)
        val viewSchedule = findViewById<TextView>(R.id.activityInfoBusBarco_schedule)
        val viewPrice = findViewById<TextView>(R.id.activityInfoBusBarco_price)
        val viewMaxP = findViewById<TextView>(R.id.activityInfoBusBarco_maxP)
        val viewFoto = findViewById<ImageView>(R.id.activityInfoBusBarco_foto)
        val viewDescription = findViewById<TextView>(R.id.activityInfoBusBarco_description)

        viewRoute.text = route
        viewSchedule.text = schedule
        viewPrice.text = price
        viewMaxP.text = maxP
        viewFoto.setImageResource(foto)
        viewDescription.text = description
    }
}