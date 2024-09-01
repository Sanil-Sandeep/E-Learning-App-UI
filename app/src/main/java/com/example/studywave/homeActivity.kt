package com.example.studywave

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class homeActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var payment = findViewById<TextView>(R.id.payment)
        payment.setOnClickListener {
            val intent = Intent(this, softwareChooseActivity::class.java)
            startActivity(intent)
            finish()
        }

        var cip = findViewById<TextView>(R.id.cip)
        cip.setOnClickListener {
            val intent = Intent(this, categoryActivity::class.java)
            startActivity(intent)
            finish()
        }

        var adobexd = findViewById<TextView>(R.id.t1)
        adobexd.setOnClickListener {
            val intent = Intent(this, courseActivity::class.java)
            startActivity(intent)
            finish()
        }
        var buyarrow = findViewById<ImageView>(R.id.buyarrow)
        buyarrow.setOnClickListener {
            val intent = Intent(this, softwareChooseActivity::class.java)
            startActivity(intent)
            finish()
        }
        var profile = findViewById<ImageView>(R.id.profile)
        profile.setOnClickListener {
            val intent = Intent(this, UserProfileActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}