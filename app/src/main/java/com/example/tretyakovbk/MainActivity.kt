package com.example.tretyakovbk

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.util.regex.Pattern.compile

class MainActivity : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var password: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        email = findViewById(R.id.editTextTextEmailAddress)
        password = findViewById(R.id.editTextTextPassword)

    }
    private val pattern = ("[a-z0-9]{1,256}" +
            "\\@"+
            "[a-z0-9]{1,10}" +
            "\\."+
            "[a-z]{1,3}")
    fun registration(view: View)
    {
        val intent = Intent(this@MainActivity, SignInActivity::class.java)
        startActivity(intent)
    }
    fun EmailValid (email:String):Boolean{
        return compile (pattern).matcher(email).matches()}

    fun Menu(view: View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
            if(EmailValid(email.text.toString())){
            val intent = Intent(this@MainActivity, MenuActivity()::class.java)
            startActivity(intent)
        }
        else {
                val alert = AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Введите корректный E-mail")
                    .setPositiveButton("OK", null)
                    .create()
                    .show()
            }
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("У вас есть незаполненные поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }

}







