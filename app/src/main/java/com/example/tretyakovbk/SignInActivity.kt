package com.example.tretyakovbk

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.regex.Pattern.compile

class SignInActivity : AppCompatActivity() {
     lateinit var email1: EditText
    lateinit var password1: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email1 = findViewById(R.id.editTextTextEmailAddress)
        password1 = findViewById(R.id.editTextTextPassword)

}
    private val pattern = ("[a-z0-9]{1,256}" +
            "\\@"+
            "[a-z0-9]{1,10}" +
            "\\."+
            "[a-z]{1,3}")


    private fun EmailValid (email:String):Boolean{
        return compile (pattern).matcher(email).matches()}

    fun zaregatsa(view: View) {
        if(email1.text.toString().isNotEmpty() && password1.text.toString().isNotEmpty())
        {
            if(EmailValid(email1.text.toString())){
                val intent = Intent(this@SignInActivity,MainActivity::class.java)
                startActivity(intent)
            }
            else{
                AlertDialog.Builder(this)
                    .setTitle("Ошибка")
                    .setMessage("Введите корректный E-mail")
                    .setPositiveButton("OK", null)
                    .create()
                    .show()
            }

        }
        else
        {
            AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("Заполните все поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }




}