package com.example.wondersofometepe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class TransporteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transporte)

        val cardBus = findViewById<CardView>(R.id.cardViewBus)
        val cardTaxi = findViewById<CardView>(R.id.cardViewTaxi)
        val cardBarco = findViewById<CardView>(R.id.cardViewBarco)
        val cardMotoCycle = findViewById<CardView>(R.id.cardViewMotorCycle)

        cardBus.setOnClickListener { replaceFragment(ListTransportFragment(1)) }
        cardTaxi.setOnClickListener { replaceFragment(ListTransportFragment(2)) }
        cardBarco.setOnClickListener { replaceFragment(ListTransportFragment(3)) }
        cardMotoCycle.setOnClickListener { replaceFragment(ListTransportFragment(4)) }
    }

    private fun replaceFragment (fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentLayout_activityTransport, fragment)
        fragmentTransaction.commit()
    }
}