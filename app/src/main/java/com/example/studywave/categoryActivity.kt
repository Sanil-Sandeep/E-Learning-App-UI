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

class categoryActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_category)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this, homeActivity::class.java)
            startActivity(intent)
            finish()
        }
        var adobexd = findViewById<TextView>(R.id.t1)
        adobexd.setOnClickListener {
            val intent = Intent(this, courseActivity::class.java)
            startActivity(intent)
            finish()
        }

        var sketch = findViewById<TextView>(R.id.t2)
        sketch.setOnClickListener {
            val intent = Intent(this, sketchCourseActivity::class.java)
            startActivity(intent)
            finish()
        }

        var aftereffects = findViewById<TextView>(R.id.t3)
        aftereffects.setOnClickListener {
            val intent = Intent(this, afterEffectsCourseActivity::class.java)
            startActivity(intent)
            finish()
        }

        var photoshop = findViewById<TextView>(R.id.t5)
        photoshop.setOnClickListener {
            val intent = Intent(this, photoshopCourseActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}