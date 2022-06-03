package com.example.wondersofometepe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class InfoSpaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_space)

        val name = intent.getStringExtra("name")
        val fotoUri = intent.getIntExtra("imageUri", R.drawable.img_punta)
        val address = intent.getStringExtra("address")
        val description = intent.getStringExtra("description")

        val viewFoto = findViewById<ImageView>(R.id.activityInfoSpace_foto)
        val viewAddress = findViewById<TextView>(R.id.activityInfoSpace_address)
        val viewDescription = findViewById<TextView>(R.id.activityInfoSpace_description)

        //setTitle(name) //no disponible action Bar
        viewFoto.setImageResource(fotoUri)
        viewAddress.text = address
        viewDescription.text = description
    }
}