package com.example.ex3.ex5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ex3.R
import kotlinx.android.synthetic.main.existmemo.*

class ThridActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.existmemo)

        btn_Add2.setOnClickListener {
            var intent = Intent(this, MainActivity_ex5::class.java)
            startActivity(intent)
        }



    }
}