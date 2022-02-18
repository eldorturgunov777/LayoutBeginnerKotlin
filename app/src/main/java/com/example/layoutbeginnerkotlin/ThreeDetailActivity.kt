package com.example.layoutbeginnerkotlin

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ThreeDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_detail)
        val text1=findViewById<TextView>(R.id.userid)
        val text2=findViewById<TextView>(R.id.password)

        val intent = intent

        val login = intent.getStringExtra("name")
        val password = intent.getStringExtra("pass")

        text1.setText(login);
        text2.setText(password);
    }
}