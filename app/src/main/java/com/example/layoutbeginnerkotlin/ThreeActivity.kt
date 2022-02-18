package com.example.layoutbeginnerkotlin

import android.R.attr.password
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class ThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three)
        initViews()
    }

    fun initViews() {
        val next1 = findViewById<Button>(R.id.logIn)
        val email = findViewById<EditText>(R.id.email)
        val pass = findViewById<EditText>(R.id.pass)

        val name = email.text.toString()
        val password: String = pass.getText().toString()
        next1.setOnClickListener {
            val intent = Intent(this@ThreeActivity, ThreeDetailActivity::class.java)
            intent.putExtra("name", name)
            intent.putExtra("pass", password)
            startActivity(intent)
        }
    }
}