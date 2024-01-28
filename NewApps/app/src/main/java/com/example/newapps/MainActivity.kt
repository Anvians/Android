package com.example.newapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {

    lateinit var constrain : ConstraintLayout
    lateinit var image : ImageView
    lateinit var name : EditText
    lateinit var male : CheckBox
    lateinit var female : CheckBox
    lateinit var red : RadioButton
    lateinit var green : RadioButton
    lateinit var blue : RadioButton
    lateinit var data : Button
    lateinit var bgColor : Button
    lateinit var textArea : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //introducing Id's

        constrain = findViewById(R.id.mainContainer)
        image = findViewById(R.id.image)
        name = findViewById(R.id.name)
        textArea = findViewById(R.id.textViewArea)
        male = findViewById(R.id.maleRb)
        female = findViewById(R.id.FemaleRb)
        red = findViewById((R.id.red))
        green = findViewById(R.id.Green)
        blue = findViewById(R.id.blue)
        data = findViewById(R.id.yourData)
        bgColor = findViewById(R.id.bgColor)


        data.setOnClickListener{
            var nameVariable : String = name.text.toString()
            textArea.setText(nameVariable)
            if(male.isChecked){
                textArea.text = "You are Male"
                female.isChecked = false
            }
            else if (female.isChecked) {
                textArea.text = "You are Female"
                male.isChecked = false
            }
            else{
                textArea.text = "Your Gender is?"
            }
        }



    }
}