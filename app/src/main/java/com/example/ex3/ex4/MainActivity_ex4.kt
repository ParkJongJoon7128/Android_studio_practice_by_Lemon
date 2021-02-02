package com.example.ex3.ex4

import android.annotation.SuppressLint
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
            if (edit_num.text.count() >= 1) {
                val edit_num: String = edit_num.text.toString()
                buy_Coffee(edit_num)
            } else {
                //null일 경우 기본값 0 반환
                Toast.makeText(applicationContext, "번호를 입력해주세요", Toast.LENGTH_SHORT).show()

                //buy_Coffee() 호출할 이유가 없습니다..
            }
        }
    }

    private fun buy_Coffee(edit_num: String) {
        // 메소드명은 저렇게 표기하지 않도록 합니다. buyCoffee로 해주세요
        when (edit_num) {

            "1" -> {
                getResult(m1, "아메리카노")
            }

            "2" -> {
                getResult(m2, "라떼")
            }

            "3" -> {
                getResult(m3, "핫초코")
            }

            "4" -> {
                getResult(m4, "조각케익")
            }

            else -> {
                Toast.makeText(this, "메뉴판에 없는 메뉴입니다", Toast.LENGTH_SHORT).show()

            }

        }
    }

    @SuppressLint("SetTextI18n")
    private fun getResult(menu : Int, menuName : String) {

        if(totalMoney >= menu) {
            totalMoney -= menu
            result_tv.text = "전재산: ${totalMoney}원"
            Toast.makeText(this, "$menuName 구매", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "잔액 부족", Toast.LENGTH_SHORT).show()

        }


    }


}