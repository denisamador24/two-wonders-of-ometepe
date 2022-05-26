package com.example.wondersofometepe

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

        cardRestaurant.setOnClickListener { replaceFragment(ListLocalsFragment("restaurant")) }
        cardBars.setOnClickListener { replaceFragment(ListLocalsFragment("bar")) }
        cardBeach.setOnClickListener { replaceFragment(ListLocalsFragment("beach")) }
        cardHotel.setOnClickListener { replaceFragment(ListLocalsFragment("hotel")) }
        cardPark.setOnClickListener { replaceFragment(ListLocalsFragment("park")) }

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