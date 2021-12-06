package com.example.guessingnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var initialnum:Int =789 ;

        val Number = findViewById<TextInputLayout>(R.id.guessNumber)
        val button = findViewById<Button>(R.id.button3)
        val resultdisplay = findViewById<TextView>(R.id.result)

        button.setOnClickListener {
            val numberenter = Number.editText?.text.toString().toInt()

            if (numberenter == 0) {
                resultdisplay.text = "Enter valid number"
            } else if (numberenter > initialnum) {
                resultdisplay.text = "no :( my number is smaller"
            } else if (numberenter < initialnum) {
                resultdisplay.text = "no :( my number is bigger"
            } else {
                resultdisplay.text = "You are right :)"
            }

        }
    }
}