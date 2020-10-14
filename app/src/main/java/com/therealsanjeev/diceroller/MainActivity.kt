package com.therealsanjeev.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    
    lateinit var diceImage: ImageView
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val diceButton: Button = findViewById(R.id.roll_button)
        diceButton.setOnClickListener {
            rollDice()
            //Toast.makeText(this, "Hey, Roller Clicked ", Toast.LENGTH_SHORT).show()
        }
        diceImage = findViewById(R.id.dice_img)
    }
    
    private fun rollDice() {
        //val resultText: TextView = findViewById(R.id.dice_text)
        // resultText.text = randomNum.toString()
        val randomNum = Random.nextInt(6)+1
        val drawableRes = when(randomNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableRes)
    }
}
