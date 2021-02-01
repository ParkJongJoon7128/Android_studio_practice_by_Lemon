package com.example.ex3.ex4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ex3.R
import kotlinx.android.synthetic.main.activity_main_ex3.*
import kotlinx.android.synthetic.main.activity_main_ex4.*

class MainActivity_ex4 : AppCompatActivity() {
    var totalMoney = 500000 // 계좌 총액
    var m1 = 3200 // 아메리카노 금액
    var m2 = 4000 // 라떼 금액
    var m3 = 4500 // 핫초코 금액
    var m4 = 5000 // 조각 케이크 금액

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ex4)

        btn_buy.setOnClickListener {
            // null 체크
            if (edit_num.text.count() > 1) {
                var edit_num: Int = edit_num.text.toString().toInt()
                buy_Coffee(edit_num)
            } else {
                //null일 경우 기본값 0 반환
                buy_Coffee()
            }
        }
    }

    private fun buy_Coffee(edit_num: Int = 0) {
        when {
            (edit_num == 1) -> {
                totalMoney -= m1
                Toast.makeText(
                    applicationContext,
                    "총 ${totalMoney - m1}원을 출금하였습니다",
                    Toast.LENGTH_SHORT
                ).show()
                result_tv.text = totalMoney.toString()
            }
            (edit_num == 2) -> {
                totalMoney -= m2
                Toast.makeText(
                    applicationContext,
                    "총 ${totalMoney - m2}원을 출금하였습니다",
                    Toast.LENGTH_SHORT
                ).show()
                result_tv.text = totalMoney.toString()
            }
            (edit_num == 3) -> {
                totalMoney -= m3
                Toast.makeText(
                    applicationContext,
                    "총 ${totalMoney - m3}원을 출금하였습니다",
                    Toast.LENGTH_SHORT
                ).show()
                result_tv.text = totalMoney.toString()
            }
            (edit_num == 4) -> {
                totalMoney -= m4
                Toast.makeText(
                    applicationContext,
                    "총 ${totalMoney - m4}원을 출금하였습니다",
                    Toast.LENGTH_SHORT
                ).show()
                result_tv.text = totalMoney.toString()
            }
        }
    }
}