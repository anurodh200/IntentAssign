package com.example.intentassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListTopic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_topic)

        val cd_1 = findViewById<CardView>(R.id.cd_1)
        cd_1.setOnClickListener {
            //Open cd_1 Activity
            intent = Intent(applicationContext, cd_1::class.java)
            startActivity(intent)
        }

        val cd_2 = findViewById<CardView>(R.id.cd_2)
        cd_2.setOnClickListener {
            //Open cd_2 Activity
            intent = Intent(applicationContext, cd_2::class.java)
            startActivity(intent)
        }

        val cd_3 = findViewById<CardView>(R.id.cd_3)
        cd_3.setOnClickListener {
            //Open cd_3 Activity
            intent = Intent(applicationContext, cd_3::class.java)
            startActivity(intent)
        }

        val cd_4 = findViewById<CardView>(R.id.cd_4)
        cd_4.setOnClickListener {
            //Open cd_4 Activity
            intent = Intent(applicationContext, cd_4::class.java)
            startActivity(intent)
        }
    }
}