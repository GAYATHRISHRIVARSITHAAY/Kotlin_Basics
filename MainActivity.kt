package com.example.login_page

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.etEmail)
        val password = findViewById<EditText>(R.id.etPassword)
        val loginBtn = findViewById<Button>(R.id.btnLogin)

        loginBtn.setOnClickListener {
            val userEmail = email.text.toString()
            val userPassword = password.text.toString()
            if(userEmail.isEmpty() || userPassword.isEmpty()){
                Toast.makeText(this,"Fields cannot be empty",Toast.LENGTH_SHORT).show()
            }
            else if(userPassword.length<5){
                Toast.makeText(this, "Password length must be minimum of 8 characters",Toast.LENGTH_SHORT).show()
            }
            else if (userEmail == "gayathrishrivarsithaa@gmail.com" && userPassword == "Gayathri") {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
