package com.example.fragmentseactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.fragmentseactivities.R

class MainActivity : AppCompatActivity() {

    private var buttonToFragmentOne : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonToFragmentOne = findViewById(R.id.btnToBeta1)
        buttonToFragmentOne?.setOnClickListener {
            onClickToFragmentOne()
        }


    }

    fun onClickToFragmentOne(){
        val intent = Intent(this, BetaActivity::class.java)
        startActivity(intent)
    }
}