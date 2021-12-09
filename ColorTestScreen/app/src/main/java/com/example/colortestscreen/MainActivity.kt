package com.example.colortestscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var buttonSetColorRed: Button
    private lateinit var buttonSetColorBlue: Button
    private lateinit var buttonSetColorGreen: Button
    private lateinit var buttonSetColorBlack: Button
    private lateinit var buttonSetColorWhite: Button
    private lateinit var buttonSetColorRedAndGreen: Button
    private lateinit var buttonSetColorRedAndBlue: Button
    private lateinit var buttonSetColorGreenAndBlue: Button
    private lateinit var buttonSetColorGray: Button
    private lateinit var seekBarGray: SeekBar
    private lateinit var seekBarGrayText: TextView

    private var grayValue: Int = 17

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSetColorRed = findViewById(R.id.buttonSetColorRed)
        buttonSetColorGreen = findViewById(R.id.buttonSetColorGreen)
        buttonSetColorBlue = findViewById(R.id.buttonSetColorBlue)
        buttonSetColorBlack = findViewById(R.id.buttonSetColorBlack)
        buttonSetColorWhite = findViewById(R.id.buttonSetColorWhite)
        buttonSetColorRedAndGreen = findViewById(R.id.buttonSetColorRedAndGreen)
        buttonSetColorRedAndBlue = findViewById(R.id.buttonSetColorRedAndBlue)
        buttonSetColorGreenAndBlue = findViewById(R.id.buttonSetColorGreenAndBlue)
        buttonSetColorGray = findViewById(R.id.buttonSetColorGray)
        seekBarGray = findViewById(R.id.seekBarGray)
        seekBarGrayText = findViewById(R.id.seekBarGrayText)

        buttonSetColorRed.setOnClickListener {
            val intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("backgroundColor", getIntFromColor(255, 0, 0))
            this.startActivity(intent)
        }
        buttonSetColorGreen.setOnClickListener {
            val intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("backgroundColor", getIntFromColor(0, 255, 0))
            this.startActivity(intent)
        }
        buttonSetColorBlue.setOnClickListener {
            val intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("backgroundColor", getIntFromColor(0, 0, 255))
            this.startActivity(intent)
        }
        buttonSetColorBlack.setOnClickListener {
            val intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("backgroundColor", getIntFromColor(0, 0, 0))
            this.startActivity(intent)
        }
        buttonSetColorWhite.setOnClickListener {
            val intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("backgroundColor", getIntFromColor(255, 255, 255))
            this.startActivity(intent)
        }
        buttonSetColorRedAndGreen.setOnClickListener {
            val intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("backgroundColor", getIntFromColor(255, 255, 0))
            this.startActivity(intent)
        }
        buttonSetColorRedAndBlue.setOnClickListener {
            val intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("backgroundColor", getIntFromColor(255, 0, 255))
            this.startActivity(intent)
        }
        buttonSetColorGreenAndBlue.setOnClickListener {
            val intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("backgroundColor", getIntFromColor(0, 255, 255))
            this.startActivity(intent)
        }
        buttonSetColorGray.setOnClickListener {
            val intent = Intent(this, ColorActivity::class.java)
            intent.putExtra("backgroundColor", getIntFromColor(grayValue, grayValue, grayValue))
            this.startActivity(intent)
        }
        seekBarGray.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBarGray: SeekBar, progress: Int, fromUser: Boolean) {
                seekBarGrayText.setText(seekBarGray.getProgress().toString() + " of 255")
                grayValue = seekBarGray.getProgress()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
    }
}
