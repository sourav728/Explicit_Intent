package com.tvd.explicit_intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val id: Int = 10
    val language: String = "Kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener{
            intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("id",id)
            intent.putExtra("language", language)
            startActivity(intent)
        }
    }
}
