package com.example.ex3.ex3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.ex3.R
import kotlinx.android.synthetic.main.activity_main_ex3.*

class MainActivity_ex3 : AppCompatActivity() {

    private var fee = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ex3)

        pay_self.setOnClickListener(clickListener1)
        pay_someone.setOnClickListener(clickListener2)
    }

    private val clickListener1: View.OnClickListener = View.OnClickListener { view ->
        var inner_fee = 1200
        var input_money = input_pay.text.toString().toInt()
        var result = text4.text.toString().toInt() + input_money - inner_fee
        text4.setText(result.toString())

        fee += 1200
        text6.setText(fee.toString())

    }

    private val clickListener2: View.OnClickListener = View.OnClickListener { view ->
        var inner_fee = 1200
        var input_money = input_pay.text.toString().toInt()
        var current_money = text4.text.toString().toInt()
        if (input_money > current_money) {
            Toast.makeText(applicationContext, "출금 불가", Toast.LENGTH_SHORT).show()
        } else {
            var result = current_money - input_money - inner_fee
            text4.setText(result.toString())

            fee += 1200
            text6.setText(fee.toString())
        }
    }
}
