package com.example.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.etAge)

        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)

        val tvDisplay = findViewById<TextView>(R.id.tvDisplay)

        btnGenerate.setOnClickListener {

            var message: String = ""

            if (etAge.toString().toInt() == 20) {
                message = "You are ${etAge.toString().toInt()} years old, which is the same age as Pop Smoke"
            } else if (etAge.toString().toInt() == 30) {
                message = "You are ${etAge.toString().toInt()} years old, which is the same age as Bob Marley"
            } else if (etAge.toString().toInt() == 40) {
                message = "You are ${etAge.toString().toInt()} years old, which is the same age as Paul Walker"
            } else if (etAge.toString().toInt() == 50) {
                message = "You are ${etAge.toString().toInt()} years old, which is the same age as Michael Jackson"
            } else if (etAge.toString().toInt() == 60) {
                message = "You are ${etAge.toString().toInt()} years old, which is the same age as Diego Maradona"
            } else if (etAge.toString().toInt() == 70) {
                message = "You are ${etAge.toString().toInt()} years old, which is the same age as Marco Polo"
            } else if (etAge.toString().toInt() == 80) {
                message = "You are ${etAge.toString().toInt()} years old, which is the same age as Alex Trebek"
            } else if (etAge.toString().toInt() == 90) {
                message = "You are ${etAge.toString().toInt()} years old, which is the same age as Enzo Ferrari"
            } else {
                message = "There is no historical figure known to be around ${etAge.toString().toInt()} years old"
            }

            tvDisplay.text = "{etAge}, ${message} \n"+ ""










        }
    }
}