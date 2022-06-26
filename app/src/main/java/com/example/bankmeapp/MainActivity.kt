package com.example.bankmeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextNum:EditText = findViewById(R.id.etPhoneNumber)
        var editTextPass:EditText = findViewById(R.id.etpassword)

        val button:Button = findViewById(R.id.btn_login)

        button.setOnClickListener {
            var logIn = logedIn(
                editTextNum.text.toString(),
                editTextPass.text.toString()
            )

            if (){
                print("ok")
            }else {
                print("INCORRECT")
            }
            }

        }
    fun logedIn(phoneNumber: String, password:String): String {
        return ("loged in succsessfully")
    }

}