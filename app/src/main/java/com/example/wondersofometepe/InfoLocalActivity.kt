package com.example.wondersofometepe

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
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
        val cardPhoneNumber = findViewById<CardView>(R.id.activityInfoLugares_cardPhoneNumber)
        val address = findViewById<TextView>(R.id.activityInfoLugares_address)
        val schedule = findViewById<TextView>(R.id.activityInfoLugares_schedule)
        val cardCalendar = findViewById<CardView>(R.id.activityInfoLugares_cardCalendar)
        val email = findViewById<TextView>(R.id.activityInfoLugares_email)
        val cardEmail = findViewById<CardView>(R.id.activityInfoLugares_cardEmail)
        val description = findViewById<TextView>(R.id.activityInfoLugares_description)

        image.setImageResource(FotoUri)
        phoneNumber.text = textPhoneNumber
        address.text = textAddress
        schedule.text = textSchedule
        description.text = textDescription

        cardCalendar.visibility = View.GONE

        if (textEmail.equals("")){
            cardEmail.visibility = View.GONE
        } else {
            email.text = textEmail
        }

        cardPhoneNumber.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$textPhoneNumber")
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        finish()
    }
}