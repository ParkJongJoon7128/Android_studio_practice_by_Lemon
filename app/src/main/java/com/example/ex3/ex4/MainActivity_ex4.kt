package com.example.ex3.ex4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ex3.R
import kotlinx.android.synthetic.main.activity_main_ex3.*
import kotlinx.android.synthetic.main.activity_main_ex4.*

class MainActivity_ex4 : AppCompatActivity() {

    var totalMoney = 50000 // 계좌 총액
    var m1 = 3200 // 아메리카노 금액
    var m2 = 4000 // 라떼 금액
    var m3 = 4500 // 핫초코 금액
    var m4 = 5000 // 조각 케이크 금액

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ex4)

        btn_buy.setOnClickListener {
            // null 체크
            if (edit_num.text.count() == 1) {
                var edit_num: Int = edit_num.text.toString().toInt()
                buy_Coffee(edit_num)
            } else {
                //null일 경우 기본값 0 반환
                Toast.makeText(
                        applicationContext,
                        "번호를 입력해주세요",
                        Toast.LENGTH_SHORT
                ).show()
                buy_Coffee()
            }
        }
    }

    private fun buy_Coffee(edit_num: Int = 0) {
        when {
            (edit_num == 1) -> {
                if (totalMoney <= m1 && totalMoney <= m2 && totalMoney <= m3 && totalMoney <= m4) {
                    Toast.makeText(
                            applicationContext,
                            "잔액이 부족합니다",
                            Toast.LENGTH_SHORT
                    ).show()
                } else {
                    totalMoney -= m1
                    Toast.makeText(
                            applicationContext,
                            "잔액 : ${totalMoney}원",
                            Toast.LENGTH_SHORT
                    ).show()
                    result_tv.text = "전재산 : ${totalMoney.toString()}원"
                }

            }
            (edit_num == 2) -> {
                if (totalMoney <= m1 && totalMoney <= m2 && totalMoney <= m3 && totalMoney <= m4) {
                    Toast.makeText(
                            applicationContext,
                            "잔액이 부족합니다",
                            Toast.LENGTH_SHORT
                    ).show()
                } else {
                    totalMoney -= m2
                    Toast.makeText(
                            applicationContext,
                            "잔액 : ${totalMoney}원",
                            Toast.LENGTH_SHORT
                    ).show()
                    result_tv.text = "전재산 : ${totalMoney.toString()}원"
                }
            }
            (edit_num == 3) -> {
                if (totalMoney <= m1 && totalMoney <= m2 && totalMoney <= m3 && totalMoney <= m4) {
                    Toast.makeText(
                            applicationContext,
                            "잔액이 부족합니다",
                            Toast.LENGTH_SHORT
                    ).show()
                } else {
                    totalMoney -= m3
                    Toast.makeText(
                            applicationContext,
                            "잔액 : ${totalMoney}원",
                            Toast.LENGTH_SHORT
                    ).show()
                    result_tv.text = "전재산 : ${totalMoney.toString()}원"
                }
            }
            (edit_num == 4) -> {
                if (totalMoney <= m1 && totalMoney <= m2 && totalMoney <= m3 && totalMoney <= m4) {
                    Toast.makeText(
                            applicationContext,
                            "잔액이 부족합니다",
                            Toast.LENGTH_SHORT
                    ).show()
                } else {
                    totalMoney -= m4
                    Toast.makeText(
                            applicationContext,
                            "잔액 : ${totalMoney}원",
                            Toast.LENGTH_SHORT
                    ).show()
                    result_tv.text = "전재산 : ${totalMoney.toString()}원"
                }
            }
            else -> {
                Toast.makeText(
                        applicationContext,
                        "맞는 번호를 입력하세요",
                        Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}