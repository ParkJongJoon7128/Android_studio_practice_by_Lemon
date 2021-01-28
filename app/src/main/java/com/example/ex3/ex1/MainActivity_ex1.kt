package com.example.ex3.ex1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.example.ex3.R
import kotlinx.android.synthetic.main.activity_main_ex1.*

class MainActivity_ex1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ex1)

        var text : String = "<font color=#11ffb1>홍길동</font>님, 안녕하세요?"
        text2.setText(Html.fromHtml(text))
    }
}