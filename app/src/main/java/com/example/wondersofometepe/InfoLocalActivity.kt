package com.example.wondersofometepe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class InfoLocalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_local)

        val textName = intent.getStringExtra("name")
        val FotoUri = intent.getIntExtra("foto", R.drawable.xalli)
        val textAddress = intent.getStringExtra("address")
        val textPhoneNumber = intent.getStringExtra()
    }
}