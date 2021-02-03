package com.example.ex3.ex5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ex3.R
import kotlinx.android.synthetic.main.activity_main_ex5.*
import kotlinx.android.synthetic.main.list_item.*

class MainActivity_ex5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ex5)

        btn_writeMemo.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        btn_seeMemo.setOnClickListener {
            var intent = Intent(this, ThridActivity::class.java)
            startActivity(intent)
        }

        var title = intent.getStringExtra("title")
        var content = intent.getStringExtra("content")

        textView1.text = title
        textView2.text = content

    }
}