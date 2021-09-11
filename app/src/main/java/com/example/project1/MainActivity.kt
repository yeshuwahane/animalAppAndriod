package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_dog.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            intent.putExtra("data","dog")
            startActivity(intent)
        }

        button_fish.setOnClickListener {
            Intent(this, ListActivity::class.java).apply {
                putExtra("data","fish")
                startActivity(this)
            }
        }

    }


}