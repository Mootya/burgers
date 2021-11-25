package com.example.tretyakovbk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Privy3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privy3)
    }
    fun nachalo (view: View)
    {
        val intent = Intent(this@Privy3Activity, MainActivity::class.java)
        startActivity(intent)
    }
}