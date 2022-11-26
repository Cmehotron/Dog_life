package com.example.dog_life

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ui.*



class MainActivity : AppCompatActivity() {

    lateinit var appBarConfig: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}