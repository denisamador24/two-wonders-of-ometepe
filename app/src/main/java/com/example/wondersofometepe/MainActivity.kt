package com.example.wondersofometepe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navcontroller = findNavController(R.id.nav_host_fragment)
        val buttonNavView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment, R.id.profileFragment))
        setupActionBarWithNavController(navcontroller, appBarConfiguration)

        buttonNavView.setupWithNavController(navcontroller)
    }
}