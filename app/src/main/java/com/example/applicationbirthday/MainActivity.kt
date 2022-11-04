package com.example.applicationbirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createbirthdaycard(view: View) {
        val name=Input.editableText.toString()
        val intent = Intent(this,Birthdaygreetactivity::class.java)
        intent.putExtra("name",name)
        startActivity(intent)
    }
}