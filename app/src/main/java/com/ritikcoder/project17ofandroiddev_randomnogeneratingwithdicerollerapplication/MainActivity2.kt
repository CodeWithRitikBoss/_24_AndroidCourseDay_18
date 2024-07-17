package com.ritikcoder.project17ofandroiddev_randomnogeneratingwithdicerollerapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ritikcoder.project17ofandroiddev_randomnogeneratingwithdicerollerapplication.databinding.ActivityMain2Binding
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonForRollDice.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {

        //Here I am Generating Random number.
        val randomNumber= Random.nextInt(6)+1

        val drawableResource= when(randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        binding.imageViewForDice.setImageResource(drawableResource)
        binding.textViewDiscNo.text= randomNumber.toString()

        }
    }