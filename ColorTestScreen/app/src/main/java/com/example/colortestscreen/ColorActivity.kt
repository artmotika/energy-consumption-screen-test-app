package com.example.colortestscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.constraintlayout.widget.ConstraintLayout

class ColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_color)
        val bgcolor: ConstraintLayout = findViewById(R.id.bgcolor)
        bgcolor.setBackgroundColor(getIntent().getIntExtra("backgroundColor", 0))
        val handler = Handler()
        handler.postDelayed({
            //Do something after dealay time
            val intent = Intent(this, MainActivity::class.java)
            this.startActivity(intent)
        }, 10000)
    }
}