package com.example.studywave

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class courseActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_course)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var backbutton = findViewById<ImageView>(R.id.back)
        backbutton.setOnClickListener {
            val intent = Intent(this, homeActivity::class.java)
            startActivity(intent)
            finish()
        }

        var introduction = findViewById<TextView>(R.id.tt1)
        introduction.setOnClickListener {
            val intent = Intent(this, adobeXDIntroductionActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}