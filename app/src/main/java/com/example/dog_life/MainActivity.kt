package com.example.dog_life

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var appBarConfig: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // устанавливаем свою реализацию тулбара
      //  setSupportActionBar(toolbar)

       // val navController = findNavController(R.id.fragment_container)

        // конфигурация тулбара
        //appBarConfig = AppBarConfiguration(navController.graph, drawer_layout)
        //setupActionBarWithNavController(navController, appBarConfig)

        // метод, который связывает шторку с навигацией
        //nav_view.setupWithNavController(navController)
    }

    // отслеживает клик по иконке гамбургера и стрелке UP
   // override fun onSupportNavigateUp(): Boolean {
    //    val navController = findNavController(R.id.fragment_container)
   //     return navController.navigateUp(appBarConfig) || super.onSupportNavigateUp()
  //  }
}