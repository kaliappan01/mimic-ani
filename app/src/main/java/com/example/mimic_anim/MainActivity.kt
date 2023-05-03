package com.example.mimic_anim

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener{
            getAnimal()
        }
    }

    private fun getAnimal() {
        val jungle = Jungle(listOf("Cat","Dog","Wolf","Snake"));
        val mssgBox : TextView = findViewById(R.id.message)
        mssgBox.text = jungle.roll().toString()
    }
}
class Jungle(val animals : List<String>){
    fun roll(): String {
        return animals.get((0..animals.size).random())
    }
}