package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adapter.SampleAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private  val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        var list =  arrayListOf("Apple", "Mango", "Org", "Osam", "Qwerty")


        rv.adapter = SampleAdapter(list)




        // XML
        // Adapter
        // LISt of DATA






    }


    override fun onBackPressed() {
        super.onBackPressed()

    }




}



