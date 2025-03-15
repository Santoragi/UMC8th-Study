package com.example.androidstudy

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val happyButton = findViewById<ImageButton>(R.id.happy_stamp)
        happyButton.setOnClickListener{
            val intent = Intent(this,HappyActivity::class.java)
            startActivity(intent)
        }

        val exiteButton = findViewById<ImageButton>(R.id.exite_stamp)
        exiteButton.setOnClickListener{
            val intent = Intent(this,ExiteActivity::class.java)
            startActivity(intent)
        }

        val normalButton = findViewById<ImageButton>(R.id.normal_stamp)
        normalButton.setOnClickListener{
            val intent = Intent(this,NormalActivity::class.java)
            startActivity(intent)
        }

        val anxiousButton = findViewById<ImageButton>(R.id.anxious_stamp)
        anxiousButton.setOnClickListener{
            val intent = Intent(this,AnxiousActivity::class.java)
            startActivity(intent)
        }

        val angryButton = findViewById<ImageButton>(R.id.angry_stamp)
        angryButton.setOnClickListener{
            val intent = Intent(this,AngryActivity::class.java)
            startActivity(intent)
        }

    }

}