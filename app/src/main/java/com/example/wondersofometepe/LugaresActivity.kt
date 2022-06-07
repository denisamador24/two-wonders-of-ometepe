package com.example.wondersofometepe

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class LugaresActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lugares)

        val cardRestaurant = findViewById<CardView>(R.id.cardViewRestaurante)
        val cardBars = findViewById<CardView>(R.id.cardViewBar)
        val cardBeach = findViewById<CardView>(R.id.cardViewBeach)
        val cardHotel = findViewById<CardView>(R.id.cardViewHoltes)
        val cardPark = findViewById<CardView>(R.id.cardViewPark)

        val colorGreenCard = Color.rgb(168,246,162)
        val colorWhiteCard = Color.rgb(255,255,255)

        cardRestaurant.setOnClickListener {
            replaceFragment(ListLocalsFragment("restaurant"))

            cardRestaurant.setCardBackgroundColor(colorGreenCard)
            cardBars.setCardBackgroundColor(colorWhiteCard)
            cardBeach.setCardBackgroundColor(colorWhiteCard)
            cardHotel.setCardBackgroundColor(colorWhiteCard)
            cardPark.setCardBackgroundColor(colorWhiteCard)
        }
        cardBars.setOnClickListener {
            replaceFragment(ListLocalsFragment("bar"))

            cardRestaurant.setCardBackgroundColor(colorWhiteCard)
            cardBars.setCardBackgroundColor(colorGreenCard)
            cardBeach.setCardBackgroundColor(colorWhiteCard)
            cardHotel.setCardBackgroundColor(colorWhiteCard)
            cardPark.setCardBackgroundColor(colorWhiteCard)
        }
        cardBeach.setOnClickListener {
            replaceFragment(ListLocalsFragment("beach"))

            cardRestaurant.setCardBackgroundColor(colorWhiteCard)
            cardBars.setCardBackgroundColor(colorWhiteCard)
            cardBeach.setCardBackgroundColor(colorGreenCard)
            cardHotel.setCardBackgroundColor(colorWhiteCard)
            cardPark.setCardBackgroundColor(colorWhiteCard)
        }
        cardHotel.setOnClickListener {
            replaceFragment(ListLocalsFragment("hotel"))

            cardRestaurant.setCardBackgroundColor(colorWhiteCard)
            cardBars.setCardBackgroundColor(colorWhiteCard)
            cardBeach.setCardBackgroundColor(colorWhiteCard)
            cardHotel.setCardBackgroundColor(colorGreenCard)
            cardPark.setCardBackgroundColor(colorWhiteCard)
        }
        cardPark.setOnClickListener {
            replaceFragment(ListLocalsFragment("park"))

            cardRestaurant.setCardBackgroundColor(colorWhiteCard)
            cardBars.setCardBackgroundColor(colorWhiteCard)
            cardBeach.setCardBackgroundColor(colorWhiteCard)
            cardHotel.setCardBackgroundColor(colorWhiteCard)
            cardPark.setCardBackgroundColor(colorGreenCard)
        }

        val num: Int = (1..5).random()
        when(num){
            1 -> {
                replaceFragment(ListLocalsFragment("restaurant"))
                cardRestaurant.setCardBackgroundColor(colorGreenCard)
            }
            2 -> {
                replaceFragment(ListLocalsFragment("bar"))
                cardBars.setCardBackgroundColor(colorGreenCard)
            }
            3 -> {
                replaceFragment(ListLocalsFragment("beach"))
                cardBeach.setCardBackgroundColor(colorGreenCard)
            }
            4 -> {
                replaceFragment(ListLocalsFragment("hotel"))
                cardHotel.setCardBackgroundColor(colorGreenCard)
            }
            5 -> {
                replaceFragment(ListLocalsFragment("park"))
                cardHotel.setCardBackgroundColor(colorGreenCard)
            }
        }

    }

    private fun replaceFragment (fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentLayout_activityLugares, fragment)
        fragmentTransaction.commit()
    }

}