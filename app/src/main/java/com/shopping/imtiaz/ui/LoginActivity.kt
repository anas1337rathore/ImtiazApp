package com.shopping.imtiaz.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.shopping.imtiaz.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var usernameEdTxt = findViewById<EditText>(R.id.usernameEdTxt)
        var passwordEdTxt = findViewById<EditText>(R.id.passwordEdTxt)
        var loginBtn = findViewById<Button>(R.id.LoginBtn)
        var signupBtn = findViewById<Button>(R.id.SignupBtn)

        var username:String = "anas"
        var password:String = "anas"



        loginBtn.setOnClickListener{
            if (usernameEdTxt.text.toString().isNullOrEmpty()) {
                Toast.makeText(this, "Kindly enter valid username", Toast.LENGTH_SHORT).show()
            }
            if (passwordEdTxt.text.toString().isNullOrEmpty()) {
                Toast.makeText(this, "Kindly enter valid password", Toast.LENGTH_SHORT).show()
            }
            if (usernameEdTxt.text.toString() == "anas" && passwordEdTxt.text.toString() == "anas") {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
                Toast.makeText(this, "Welcome $username", Toast.LENGTH_SHORT).show()
            }
        }
        signupBtn.setOnClickListener {
            val intent = Intent(this,SignupActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}

