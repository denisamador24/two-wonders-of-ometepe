package com.example.wondersofometepe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class InfoTaxiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_taxi)

        val foto = intent.getIntExtra("fotoUri", R.drawable.img_bus_ometepe)
        val schedule = intent.getStringExtra("schedule")
        //val route = intent.getStringExtra("route")  //aun no disponible en la vista
        val maxP = intent.getIntExtra("maxP", 0)
        val price = intent.getStringExtra("price")
        val license = intent.getStringExtra("license")
        val description = intent.getStringExtra("description")
        var nameDriver = intent.getStringExtra("nameDriver")
        var cellNumberDriver = intent.getStringExtra("cellNumberDriver")
        var fotoDriver = intent.getIntExtra("fotoDriver", R.drawable.icon_account_circle)

        val viewFoto = findViewById<ImageView>(R.id.activityInfoTaxi_foto)
        val viewPrice = findViewById<TextView>(R.id.activityInfoTaxi_price)
        val viewMaxP = findViewById<TextView>(R.id.activityInfoTaxi_maxP)
        val viewSchedule = findViewById<TextView>(R.id.activityInfoTaxi_schedule)
        val viewFotoDriver = findViewById<ImageView>(R.id.activityInfoTaxi_fotoDriver)
        val viewNameDriver = findViewById<TextView>(R.id.activityInfoTaxi_nameDriver)
        val viewPhoneNumber = findViewById<TextView>(R.id.activityInfoTaxi_phoneNumber)
        val viewLicense = findViewById<TextView>(R.id.activityInfoTaxi_license)
        val viewDescription = findViewById<TextView>(R.id.activityInfoTaxi_description)

        viewFoto.setImageResource(foto)
        viewSchedule.text = schedule
        viewPrice.text = price
        viewMaxP.text = maxP.toString()
        viewFotoDriver.setImageResource(fotoDriver)
        viewNameDriver.text = nameDriver
        viewPhoneNumber.text = cellNumberDriver
        viewLicense.text = license
        viewDescription.text = description
    }
}