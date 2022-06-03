package com.example.wondersofometepe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class InfoTaxiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_taxi)

        var nameDriver = intent.getStringExtra("nameDriver")
        var cellNumberDriver = intent.getStringExtra("cellNumberDriver")
        var fotoDriver = intent.getStringExtra("fotoDriver")
    }
}