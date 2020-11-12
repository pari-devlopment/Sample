package com.example.sample

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(R.layout.actvity_second) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onBackPressed() {
        super.onBackPressed()

        var intent = Intent(applicationContext, ThirdActivity::class.java);
        startActivity(intent)

    }
}