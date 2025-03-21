package com.example.androidstudy

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.androidstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container) as NavHostFragment

        val navController = navHostFragment.navController

        // BottomNavigationView 설정
        binding.bottomNavi.setupWithNavController(navController)

        // BottomNavigationView 아이템 선택 리스너 설정
        binding.bottomNavi.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    navController.navigate(R.id.fragment_home)
                    true
                }
                R.id.navigation_social -> {
                    navController.navigate(R.id.fragment_social)
                    true
                }
                R.id.navigation_record -> {
                    navController.navigate(R.id.fragment_record)
                    true
                }
                R.id.navigation_mypage -> {
                    navController.navigate(R.id.fragment_mypage)
                    true
                }
                else -> false
            }
        }
    }

    fun hideBottomNavigation(state:Boolean){
        if(state) binding.bottomNavi.visibility = View.GONE else binding.bottomNavi.visibility=View.VISIBLE
    }
}
