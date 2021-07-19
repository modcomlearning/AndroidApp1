package com.mwishen.modcom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //an activity is a single screen
        //we get all views and make them variables in kotlin
        val textapply = findViewById<TextView>(R.id.textapply)
        val editusername = findViewById<EditText>(R.id.editusername)
        val editothers = findViewById<EditText>(R.id.editothers)
        val radiomale = findViewById<RadioButton>(R.id.radiomale)
        val radiofemale = findViewById<RadioButton>(R.id.radiofemale)
        val checkttravel = findViewById<CheckBox>(R.id.checktravel)
        val checkreading = findViewById<CheckBox>(R.id.checkreading)
        val checkwriting = findViewById<CheckBox>(R.id.checkwriting)
        val buttonsave = findViewById<Button>(R.id.buttonsave)

        val buttonnext = findViewById<Button>(R.id.buttonnext)
        buttonnext.setOnClickListener {
            //How to Create another page/Activity
            //Right Click on app - New - Activity - Empty Activity
            //Put the activity name
            val i = Intent(this, Page2::class.java)
            startActivity(i)
            //that is explicit intent
        }//end listener


        //we make button listen that a user is clicking
        buttonsave.setOnClickListener {
            //lets get what the user entered or selected
            val usernamevalue = editusername.text
            val othersvalue = editothers.text
            var gendervalue = ""
            if (radiomale.isChecked){
               gendervalue = "Male"
            }
            if (radiofemale.isChecked){
                gendervalue = "Female"
            }
            //checkboxes
            var interests = ""
            if (checkreading.isChecked){
                interests += "Reading"
            }

            if (checkttravel.isChecked){
                interests += "Travelling"
            }

            if (checkwriting.isChecked){
                interests += "Writing"
            }

            Toast.makeText(applicationContext,
                "$usernamevalue $othersvalue $gendervalue $interests",
                Toast.LENGTH_LONG).show()

        }//end the listener

    }
}