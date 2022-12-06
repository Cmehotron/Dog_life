package com.example.dog_life

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import com.example.dog_life.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            menu_left.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.menu_item1 ->{

                    }
                    R.id.menu_item2 ->{

                    }
                    R.id.menu_item3 ->{

                    }
                    R.id.menu_item4 ->{

                    }
                    R.id.menu_item5 ->{

                    }
                }
                true
            }
        }

    }
}