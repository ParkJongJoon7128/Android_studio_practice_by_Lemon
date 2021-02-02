package com.example.ex3.ex5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ex3.R
import kotlinx.android.synthetic.main.write_memo.*

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.write_memo)

        var title = edit_title.text
        var content = edit_content.text






        btn_Add1.setOnClickListener {
            var intent = Intent(this, MainActivity_ex5::class.java)
            startActivityForResult(intent, 1)
        }
    }
}