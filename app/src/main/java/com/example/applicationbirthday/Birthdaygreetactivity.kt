package com.example.applicationbirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthdaygreetactivity.*

class Birthdaygreetactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreetactivity)
        val name=intent.getStringExtra("name")
        Birthdaygreet.text="Happy Birthday\n $name!!"
    }
}