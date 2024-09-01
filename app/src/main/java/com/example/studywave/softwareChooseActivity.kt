package com.example.studywave

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class softwareChooseActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_software_choose)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var pay = findViewById<TextView>(R.id.pay)
        pay.setOnClickListener {
            val intent = Intent(this, paymentActivity::class.java)
            startActivity(intent)
            finish()
        }
        var backbtn = findViewById<ImageView>(R.id.back)
        backbtn.setOnClickListener {
            val intent = Intent(this, homeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}