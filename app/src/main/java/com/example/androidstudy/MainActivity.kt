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

        // ImageButton ID와 연결된 Activity를 Map으로 매핑
        val buttonMap = mapOf(
            R.id.happy_stamp to HappyActivity::class.java,
            R.id.exite_stamp to ExiteActivity::class.java,
            R.id.normal_stamp to NormalActivity::class.java,
            R.id.anxious_stamp to AnxiousActivity::class.java,
            R.id.angry_stamp to AngryActivity::class.java
        )

        // 반복문을 사용해 리스너 설정
        buttonMap.forEach { (buttonId, activityClass) ->
            findViewById<ImageButton>(buttonId).setOnClickListener {
                startActivity(Intent(this, activityClass))
            }
        }

    }

}