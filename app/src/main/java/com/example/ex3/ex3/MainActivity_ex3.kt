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

        // 입금 버튼 클릭시
        pay_self.setOnClickListener {
            // null 체크
            if (input_pay.text.count() > 1) {
                var editMoney: Int = input_pay.text.toString().toInt()
                plusMoney(editMoney)
            } else {
                //null일 경우 기본값 0 반환
                plusMoney()
            }
        }

        // 출금 버튼 클릭시
        pay_someone.setOnClickListener {
            // null 체크
            if (input_pay.text.count() > 1) {
                var editMoney: Int = input_pay.text.toString().toInt()
                minusMoney(editMoney)
            } else {
                //null일 경우 기본값 0 반환
                minusMoney()
            }
        }
    }

    // 입금 메소드
    private fun plusMoney(editMoney: Int = 0) {
        // 입력금액이 수수료보다 많을때
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

    // 출금 메소드
    private fun minusMoney(editMoney: Int = 0) {
        val estimatedAmount: Int = (editMoney + bankFees)

        when {
            // 입력금액보다 수수료가 많을 때
            editMoney <= bankFees -> {
                Toast.makeText(applicationContext, "출금액 부족입니다", Toast.LENGTH_SHORT).show()
            }

            // 총금액이 수수료보다 적을 때
            totalMoney <= bankFees -> {
                Toast.makeText(applicationContext, "수수료 부족입니다", Toast.LENGTH_SHORT).show()
            }

            // (입력금액 + 수수료)가 총금액보다 많을 때
            estimatedAmount >= totalMoney -> {
                Toast.makeText(applicationContext, "한도 초과입니다", Toast.LENGTH_SHORT).show()
            }

            // (입력금액 + 수수료)가 총금액보다 적을 때
            estimatedAmount < totalMoney -> {
                totalMoney -= estimatedAmount
                Toast.makeText(
                        applicationContext,
                        "총 ${editMoney - bankFees}원을 출금하였습니다",
                        Toast.LENGTH_SHORT
                ).show()
                text4.text = totalMoney.toString()
                bankCount++
                text5.text = "은행이 얻은 수수료 : ${bankFees * bankCount}원"
            }
        }
    }
}



