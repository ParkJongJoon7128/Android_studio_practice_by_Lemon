package com.example.ex3.ex2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ex3.R
import kotlinx.android.synthetic.main.activity_main_ex2.*

class MainActivity_ex2 : AppCompatActivity() {

    var coffeeList = arrayListOf<Coffee>(
        Coffee("에스프레소", "Espresso", "스타벅스의 핵심인 강렬하고 카라멜향이 달콤한 음료", "espresso_small"),
        Coffee("에스프레소", "Espresso", "스타벅스의 핵심인 강렬하고 카라멜향이 달콤한 음료", "espresso_small"),
        Coffee("에스프레소", "Espresso", "스타벅스의 핵심인 강렬하고 카라멜향이 달콤한 음료", "espresso_small"),
        Coffee("에스프레소", "Espresso", "스타벅스의 핵심인 강렬하고 카라멜향이 달콤한 음료", "espresso_small"),
        Coffee("에스프레소", "Espresso", "스타벅스의 핵심인 강렬하고 카라멜향이 달콤한 음료", "espresso_small"),
        Coffee("에스프레소", "Espresso", "스타벅스의 핵심인 강렬하고 카라멜향이 달콤한 음료", "espresso_small"),
        Coffee("에스프레소", "Espresso", "스타벅스의 핵심인 강렬하고 카라멜향이 달콤한 음료", "espresso_small"),
        Coffee("에스프레소", "Espresso", "스타벅스의 핵심인 강렬하고 카라멜향이 달콤한 음료", "espresso_small"),
        Coffee("에스프레소", "Espresso", "스타벅스의 핵심인 강렬하고 카라멜향이 달콤한 음료", "espresso_small"),
        Coffee("에스프레소", "Espresso", "스타벅스의 핵심인 강렬하고 카라멜향이 달콤한 음료", "espresso_small")

        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ex2)

        recyclerView.adapter = CoffeeAdapter(this, coffeeList)

        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}