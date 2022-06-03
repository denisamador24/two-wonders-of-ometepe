package com.example.wondersofometepe

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment

class LugaresActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lugares)

        val cardRestaurant = findViewById<CardView>(R.id.cardViewRestaurante)
        val cardBars = findViewById<CardView>(R.id.cardViewBar)
        val cardBeach = findViewById<CardView>(R.id.cardViewBeach)
        val cardHotel = findViewById<CardView>(R.id.cardViewHoltes)
        val cardPark = findViewById<CardView>(R.id.cardViewPark)

        cardRestaurant.setOnClickListener {
            replaceFragment(ListLocalsFragment("restaurant"))

            cardRestaurant.setCardBackgroundColor(R.color.card_soft_green)
            cardBars.setCardBackgroundColor(R.color.white)
            cardBeach.setCardBackgroundColor(R.color.white)
            cardHotel.setCardBackgroundColor(R.color.white)
            cardPark.setCardBackgroundColor(R.color.white)
        }
        cardBars.setOnClickListener {
            replaceFragment(ListLocalsFragment("bar"))

            cardRestaurant.setCardBackgroundColor(R.color.white)
            cardBars.setCardBackgroundColor(R.color.card_soft_green)
            cardBeach.setCardBackgroundColor(R.color.white)
            cardHotel.setCardBackgroundColor(R.color.white)
            cardPark.setCardBackgroundColor(R.color.white)
        }
        cardBeach.setOnClickListener {
            replaceFragment(ListLocalsFragment("beach"))

            cardRestaurant.setCardBackgroundColor(R.color.white)
            cardBars.setCardBackgroundColor(R.color.white)
            cardBeach.setCardBackgroundColor(R.color.card_soft_green)
            cardHotel.setCardBackgroundColor(R.color.white)
            cardPark.setCardBackgroundColor(R.color.white)
        }
        cardHotel.setOnClickListener {
            replaceFragment(ListLocalsFragment("hotel"))

            cardRestaurant.setCardBackgroundColor(R.color.white)
            cardBars.setCardBackgroundColor(R.color.white)
            cardBeach.setCardBackgroundColor(R.color.white)
            cardHotel.setCardBackgroundColor(R.color.card_soft_green)
            cardPark.setCardBackgroundColor(R.color.white)
        }
        cardPark.setOnClickListener {
            replaceFragment(ListLocalsFragment("park"))

            cardRestaurant.setCardBackgroundColor(R.color.white)
            cardBars.setCardBackgroundColor(R.color.white)
            cardBeach.setCardBackgroundColor(R.color.white)
            cardHotel.setCardBackgroundColor(R.color.white)
            cardPark.setCardBackgroundColor(R.color.card_soft_green)
        }

        randomFragmnet()
    }

    private fun replaceFragment (fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentLayout_activityLugares, fragment)
        fragmentTransaction.commit()
    }

    private fun randomFragmnet(){
        val num: Int = (1..5).random()
        when(num){
            1 -> replaceFragment(ListLocalsFragment("restaurant"))
            2 -> replaceFragment(ListLocalsFragment("bar"))
            3 -> replaceFragment(ListLocalsFragment("beach"))
            4 -> replaceFragment(ListLocalsFragment("hotel"))
            5 -> replaceFragment(ListLocalsFragment("park"))
        }
    }

}