package com.example.wondersofometepe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class InfoLocalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_local)

        val textName = intent.getStringExtra("name")
        val FotoUri = intent.getIntExtra("foto", R.drawable.xalli)
        val textAddress = intent.getStringExtra("address")
        val textPhoneNumber = intent.getStringExtra("phoneNumber")
        val textDescription = intent.getStringExtra("description")
        val textSchedule = intent.getStringExtra("schedule")
        val textEmail = intent.getStringExtra("email")

        val image = findViewById<ImageView>(R.id.activityInfoLugares_images)
        val phoneNumber = findViewById<TextView>(R.id.activityInfoLugares_phoneNumber)
        val address = findViewById<TextView>(R.id.activityInfoLugares_address)
        val schedule = findViewById<TextView>(R.id.activityInfoLugares_schedule)
        val cardCalendar = findViewById<CardView>(R.id.activityInfoLugares_cardCalendar)
        val email = findViewById<TextView>(R.id.activityInfoLugares_email)
        val description = findViewById<TextView>(R.id.activityInfoLugares_description)

        image.setImageResource(FotoUri)
        phoneNumber.text = textPhoneNumber
        address.text = textAddress
        schedule.text = textSchedule
        description.text = textDescription

        cardCalendar.visibility = View.GONE

        if (textEmail.equals("")){
            email.visibility = View.GONE
        } else {
            email.text = textEmail
        }

    }
}