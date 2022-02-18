package com.example.layoutbeginnerkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun task1(view: View?) {
        val intent = Intent(this, FirstActivity::class.java)
        startActivity(intent)
    }

    fun task2(view: View?) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    fun task3(view: View?) {
        val intent = Intent(this, ThreeActivity::class.java)
        startActivity(intent)
    }

    fun task4(view: View?) {
        val intent = Intent(this, FourActivity::class.java)
        startActivity(intent)
    }
}