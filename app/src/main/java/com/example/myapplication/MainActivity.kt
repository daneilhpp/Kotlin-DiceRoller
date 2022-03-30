package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  Button : Button = findViewById(R.id.button)
        Button.setOnClickListener{
            val toast = Toast.makeText(this, "Rolou o dado!", Toast.LENGTH_SHORT).show()
            val resultTextView: TextView = findViewById(R.id.textView2)
            rollDice()

        }
    }

    class Dice(private val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }

    private fun rollDice() {
        val dice = Dice(7)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView2)
        resultTextView.text = diceRoll.toString()
        val diceImage: ImageView = findViewById(R.id.imageView)

        when (diceRoll) {

            1-> diceImage.setImageResource(R.drawable.dice_1)
            2-> diceImage.setImageResource(R.drawable.dice_2)
            3-> diceImage.setImageResource(R.drawable.dice_3)
            4-> diceImage.setImageResource(R.drawable.dice_4)
            5-> diceImage.setImageResource(R.drawable.dice_5)
            6-> diceImage.setImageResource(R.drawable.dice_6)
            7-> diceImage.setImageResource(R.drawable.images)

        }
        diceImage.contentDescription = diceRoll.toString()




    }
}