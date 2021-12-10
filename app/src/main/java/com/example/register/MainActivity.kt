package com.example.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

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



        Registerbutton.setOnClickListener {
            if(Email.text.toString() != "" && firstname.text.toString() != "" && Password.text.toString() != "" && lastname.text.toString() != "" && Username.text.toString() != ""){

                var intent = Intent(this, MainActivity2::class.java)
            var name : String =  Username.text.toString()
            intent.putExtra("NAME", name)
            startActivity(intent)
        }
        else {
            Toast.makeText(this, "გთხოვთ შეავსოთ ყველა ველი", Toast.LENGTH_SHORT).show()
        }
        alreadyregister.setOnClickListener{
            var intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}}