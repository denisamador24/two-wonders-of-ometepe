package com.example.wondersofometepe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class TransporteActivity : AppCompatActivity() {

    //@SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transporte)

        val cardBus = findViewById<CardView>(R.id.cardViewBus)
        val cardTaxi = findViewById<CardView>(R.id.cardViewTaxi)
        val cardBarco = findViewById<CardView>(R.id.cardViewBarco)
        val cardMotoCycle = findViewById<CardView>(R.id.cardViewMotorCycle)

        val colorGreenCard = Color.rgb(168,246,162)
        val colorWhiteCard = Color.rgb(255,255,255)

        cardBus.setOnClickListener {
            replaceFragment(ListTransportFragment(1))

            cardBus.setCardBackgroundColor(colorGreenCard)
            cardTaxi.setCardBackgroundColor(colorWhiteCard)
            cardBarco.setCardBackgroundColor(colorWhiteCard)
            cardMotoCycle.setCardBackgroundColor(colorWhiteCard)
        }
        cardTaxi.setOnClickListener {
            replaceFragment(ListTransportFragment(2))

            cardBus.setCardBackgroundColor(colorWhiteCard)
            cardTaxi.setCardBackgroundColor(colorGreenCard)
            cardBarco.setCardBackgroundColor(colorWhiteCard)
            cardMotoCycle.setCardBackgroundColor(colorWhiteCard)
        }
        cardBarco.setOnClickListener {
            replaceFragment(ListTransportFragment(3))

            cardBus.setCardBackgroundColor(colorWhiteCard)
            cardTaxi.setCardBackgroundColor(colorWhiteCard)
            cardBarco.setCardBackgroundColor(colorGreenCard)
            cardMotoCycle.setCardBackgroundColor(colorWhiteCard)
        }
        cardMotoCycle.setOnClickListener {
            replaceFragment(ListTransportFragment(4))

            cardBarco.setCardBackgroundColor(colorWhiteCard)
            cardTaxi.setCardBackgroundColor(colorWhiteCard)
            cardBarco.setCardBackgroundColor(colorWhiteCard)
            cardMotoCycle.setCardBackgroundColor(colorGreenCard)
        }

        val num: Int = (1..4).random()
        when(num){
            1 -> {
                replaceFragment(ListTransportFragment(1))
                cardBus.setCardBackgroundColor(colorGreenCard)
            }
            2 -> {
                replaceFragment(ListTransportFragment(2))
                cardTaxi.setCardBackgroundColor(colorGreenCard)
            }
            3 -> {
               replaceFragment(ListTransportFragment(3))
                cardBarco.setCardBackgroundColor(colorGreenCard)
            }
            4 -> {
                replaceFragment(ListTransportFragment(4))
                cardMotoCycle.setCardBackgroundColor(colorGreenCard)
            }
            else -> Toast.makeText(this, "Fragmnet no encontrado", Toast.LENGTH_SHORT).show()
        }
    }

    private fun replaceFragment (fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentLayout_activityTransport, fragment)
        fragmentTransaction.commit()
    }
}