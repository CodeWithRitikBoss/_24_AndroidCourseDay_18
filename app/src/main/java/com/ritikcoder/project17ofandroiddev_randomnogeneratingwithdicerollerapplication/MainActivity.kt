package com.ritikcoder.project17ofandroiddev_randomnogeneratingwithdicerollerapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ritikcoder.project17ofandroiddev_randomnogeneratingwithdicerollerapplication.databinding.ActivityMain2Binding
import com.ritikcoder.project17ofandroiddev_randomnogeneratingwithdicerollerapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //supportActionBar?.setBackgroundDrawable(ColorDrawable(resources.getColor(Color.CYAN)))

        Handler().postDelayed({
            //val intentToOpenNewActivity= Intent(this, ActivityMain2Binding::class.java)
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        }, 1000)

    }
}