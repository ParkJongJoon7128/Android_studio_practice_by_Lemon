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
    var bankCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ex3)

        pay_self.setOnClickListener {
            var editMoney: Int = input_pay.text.toString().toInt()
            plusMoney(editMoney)
        }
        pay_someone.setOnClickListener {
            var editMoney: Int = input_pay.text.toString().toInt()
            minusMoney(editMoney)
        }
    }


    private fun plusMoney(editMoney: Int = 0) {
        if (editMoney > bankFees) {
            totalMoney += (editMoney - bankFees)
            text4.text = totalMoney.toString()
            bankCount++
            text5.text = "은행이 얻은 수수료 : ${bankFees * bankCount}원"
        } else {
            // 수수료가 부족합니다
            Toast.makeText(applicationContext, "수수료 부족", Toast.LENGTH_SHORT).show()
        }
    }

    private fun minusMoney(editMoney: Int = 0) {
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
                text4.text = totalMoney.toString()
                bankCount++
                text5.text = "은행이 얻은 수수료 : ${bankFees * bankCount}원"
            }
        }
    }
}



