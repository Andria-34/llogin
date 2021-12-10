package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

lateinit var textView2: TextView
lateinit var Hello : TextView
lateinit var Usernametext : TextView
lateinit var Passwordtext : TextView
lateinit var button : Button
lateinit var text1 : TextView
val email = "admin@gmail.com"
val password = "admin123"



class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView2 = findViewById(R.id.textView2)
        Hello = findViewById(R.id.Hello)
        Usernametext = findViewById(R.id.Usernametext)
        Passwordtext = findViewById(R.id.Passwordtext)
        button = findViewById(R.id.button)
        text1 = findViewById(R.id.text1)

        textView2.text = intent.extras?.getString("NAME","ADMIN")


        button.setOnClickListener{
            if (Usernametext.text.toString() == email && Passwordtext.text.toString() == password){
                Toast.makeText(this, "თქვენ წარმატებით გაიარეთ ავტორიზაცია", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "თქვენ ვერ გაიარეთ ავტორიზაცია", Toast.LENGTH_SHORT).show()
        }

//        textView2.text = intent.extras?.getString("NAME","")

    }
}
}