package com.example.ex3.ex3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.ex3.R
import kotlinx.android.synthetic.main.activity_main_ex3.*

class MainActivity_ex3 : AppCompatActivity() {

    var totalMoney = 500000 // 계좌 총액
    var bankFees = 1200 // 은행 수수료

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ex3)

        var editMoney : Int = input_pay.text.toString().toInt()

        pay_self.setOnClickListener {
            plusMoney(editMoney)
        }
        pay_someone.setOnClickListener {
            minusMoney(editMoney)
        }
    }


    private fun plusMoney(editMoney: Int) {
        totalMoney += (editMoney - bankFees)
        text4.text = totalMoney.toString()
    }

    private fun minusMoney(editMoney: Int) {
        val estimatedAmount: Int = (editMoney + bankFees)

        when {
            totalMoney <= bankFees -> {
                Toast.makeText(applicationContext, "수수료 부족으로 출금 불가합니다", Toast.LENGTH_SHORT).show()
            }
            estimatedAmount >= totalMoney -> {

                Toast.makeText(applicationContext, "한도 초과입니다", Toast.LENGTH_SHORT).show()
            }
            estimatedAmount < totalMoney -> {
                totalMoney -= estimatedAmount
                Toast.makeText(
                    applicationContext,
                    "총 ${estimatedAmount}원을 출금하였습니다",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}



