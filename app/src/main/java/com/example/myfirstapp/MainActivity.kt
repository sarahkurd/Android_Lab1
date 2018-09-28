package com.example.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            text.text = "Haha It worked!"
        }

        button2.setOnClickListener {
            text.visibility = View.INVISIBLE
        }

        button3.setOnClickListener {
            Toast.makeText(this,  "Android's gonna be fun!!", Toast.LENGTH_LONG).show()
        }

        button4.setOnLongClickListener {
            Toast.makeText(this, "You clicked too long =(", Toast.LENGTH_LONG).show()
            true
        }
    }


}
