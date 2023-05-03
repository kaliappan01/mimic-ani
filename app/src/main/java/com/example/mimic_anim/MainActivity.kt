package com.example.mimic_anim

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val mssgBox : TextView = findViewById(R.id.message)
        mssgBox.text = dice.roll().toString()
    }
}
class Dice(val numSides: int){
    fun roll(): Int {
        return (1..numSides).random()
    }
}