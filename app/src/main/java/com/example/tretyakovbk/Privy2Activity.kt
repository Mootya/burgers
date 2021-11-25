package com.example.tretyakovbk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Privy2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privy2)
    }

    fun dalee1(view: android.view.View) {
        val intent = Intent(this@Privy2Activity, Privy3Activity::class.java)
        startActivity(intent)
    }
}