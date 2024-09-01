package com.example.studywave

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class UserProfileActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var back = findViewById<ImageView>(R.id.imageView11)
        back.setOnClickListener {
            val intent = Intent(this, homeActivity::class.java)
            startActivity(intent)
            finish()
        }

        var logout = findViewById<Button>(R.id.button)
        logout.setOnClickListener {
            val intent = Intent(this, LoginRegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}