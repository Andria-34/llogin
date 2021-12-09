package com.example.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

lateinit var Email: TextView
lateinit var firstname: TextView
lateinit var Password: TextView
lateinit var lastname: TextView
lateinit var Username: TextView
lateinit var Registerbutton: Button
lateinit var alreadyregister: Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Email = findViewById(R.id.Email)
        firstname = findViewById(R.id.firstname)
        Password = findViewById(R.id.Password)
        lastname = findViewById(R.id.lastname)
        Username = findViewById(R.id.Username)
        Registerbutton = findViewById(R.id.Registerbutton)
        alreadyregister = findViewById(R.id.alreadyregister)

        val firstname = intent?.extras?.getString("NAME", "")


        Registerbutton.setOnClickListener {
            var intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("NAME", firstname)
        }
    }
}