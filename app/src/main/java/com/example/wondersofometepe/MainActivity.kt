package com.example.wondersofometepe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val homeFragment : HomeFragment = HomeFragment()
    val profileFragment : ProfileFragment = ProfileFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainFragment = findViewById<FrameLayout>(R.id.nav_host_fragment)
        val buttonNavView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        var x = 2
        var y =8
        var r = x + y

        setTitle("Hola")
    }
}