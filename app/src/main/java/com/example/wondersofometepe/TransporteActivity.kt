package com.example.wondersofometepe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class TransporteActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transporte)

        val cardBus = findViewById<CardView>(R.id.cardViewBus)
        val cardTaxi = findViewById<CardView>(R.id.cardViewTaxi)
        val cardBarco = findViewById<CardView>(R.id.cardViewBarco)
        val cardMotoCycle = findViewById<CardView>(R.id.cardViewMotorCycle)

        cardBus.setOnClickListener {
            replaceFragment(ListTransportFragment(1))

            cardBus.setCardBackgroundColor(R.color.card_soft_green)
            cardTaxi.setCardBackgroundColor(R.color.white)
            cardBarco.setCardBackgroundColor(R.color.white)
            cardMotoCycle.setCardBackgroundColor(R.color.white)
        }
        cardTaxi.setOnClickListener {
            replaceFragment(ListTransportFragment(2))

            cardBus.setCardBackgroundColor(R.color.white)
            cardTaxi.setCardBackgroundColor(R.color.card_soft_green)
            cardBarco.setCardBackgroundColor(R.color.white)
            cardMotoCycle.setCardBackgroundColor(R.color.white)
        }
        cardBarco.setOnClickListener {
            replaceFragment(ListTransportFragment(3))

            cardBus.setCardBackgroundColor(R.color.white)
            cardTaxi.setCardBackgroundColor(R.color.white)
            cardBarco.setCardBackgroundColor(R.color.card_soft_green)
            cardMotoCycle.setCardBackgroundColor(R.color.white)
        }
        cardMotoCycle.setOnClickListener {
            replaceFragment(ListTransportFragment(4))

            cardBus.setCardBackgroundColor(R.color.white)
            cardTaxi.setCardBackgroundColor(R.color.white)
            cardBarco.setCardBackgroundColor(R.color.white)
            cardMotoCycle.setCardBackgroundColor(R.color.card_soft_green)
        }
    }

    private fun replaceFragment (fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentLayout_activityTransport, fragment)
        fragmentTransaction.commit()
    }
}