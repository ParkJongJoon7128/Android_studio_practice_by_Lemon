package com.example.ex3.ex5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ex3.R
import kotlinx.android.synthetic.main.activity_main_ex5.*

class MainActivity_ex5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ex5)

        btn_writeMemo.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        btn_seeMemo.setOnClickListener {

        }

    }
}