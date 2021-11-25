package com.example.tretyakovbk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Privy1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_priv1)
    }

    fun dalee(view: android.view.View)
    {
        val intent = Intent(this@Privy1Activity, Privy2Activity::class.java)
        startActivity(intent)

    }
}