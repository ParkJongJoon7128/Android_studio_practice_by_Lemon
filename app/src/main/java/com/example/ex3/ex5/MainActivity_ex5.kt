package com.example.ex3.ex5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ex3.R
import kotlinx.android.synthetic.main.activity_main_ex5.*

class MainActivity_ex5 : AppCompatActivity() {

    private val coffeeList = arrayListOf<Coffee>(
        Coffee("ic_baseline_local_cafe_24", "Americano", "Quantity-15", "3600₩"),
        Coffee("ic_baseline_local_cafe_24", "Latte", "Quantity-12", "4600₩"),
        Coffee("ic_baseline_local_cafe_24", "Cocoa", "Quantity-7", "4000₩"),
        Coffee("ic_baseline_cake_24", "Cake", "Quantity-4", "5000₩")
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_ex5)


        recyclerView.adapter = CoffeeAdapter(this, coffeeList)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}