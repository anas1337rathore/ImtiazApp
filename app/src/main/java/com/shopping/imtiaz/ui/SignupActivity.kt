package com.shopping.imtiaz.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.shopping.imtiaz.R

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var SgnUpusernameEdTxt = findViewById<EditText>(R.id.SgnUpusernameEdTxt)
        var SgnUppasswordEdTxt = findViewById<EditText>(R.id.SgnUppasswordEdTxt)
        var SgnUpconfPasswordEdTxt = findViewById<EditText>(R.id.SgnUpconfPasswordEdTxt)
        var SgnUpAddressEdTxt = findViewById<EditText>(R.id.SgnUpAddressEdTxt)
        var submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            if (SgnUpusernameEdTxt.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Kindly enter a username", Toast.LENGTH_SHORT).show()
            }
            if (SgnUppasswordEdTxt.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Kindly enter a password", Toast.LENGTH_SHORT).show()
            }
            if (SgnUpconfPasswordEdTxt.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Kindly enter confirmation password", Toast.LENGTH_SHORT).show()
            }
            if (SgnUpAddressEdTxt.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Kindly enter address", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Account created, Kindly Login", Toast.LENGTH_SHORT).show()
                val intent = Intent(this,LoginActivity::class.java)
                startActivity(intent)
                finish()
            }
        }


    }
}