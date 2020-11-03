package com.therealsanjeev.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.therealsanjeev.diceroller.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.rollButton.setOnClickListener {
            rollDice()
        }
//        val diceButton: Button = findViewById(R.id.roll_button)
//        diceButton.setOnClickListener {
//            rollDice()
//            //Toast.makeText(this, "Hey, Roller Clicked ", Toast.LENGTH_SHORT).show()
//        }
//        diceImage = findViewById(R.id.dice_img)
        binding.diceImg
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

        dice_img.setImageResource(drawableRes)
    }
}
