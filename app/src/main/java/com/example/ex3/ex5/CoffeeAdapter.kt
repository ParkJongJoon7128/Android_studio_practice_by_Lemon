package com.example.ex3.ex5

import android.content.Context
import android.media.Image
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.ex3.R
import kotlinx.android.synthetic.main.list_item.view.*

class CoffeeAdapter(val context: Context, val CoffeeList: ArrayList<Coffee>) :
        RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {


    override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
    ): CoffeeAdapter.CoffeeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)

        return CoffeeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return CoffeeList.size
    }

    override fun onBindViewHolder(holder: CoffeeAdapter.CoffeeViewHolder, position: Int) {

        holder.itemView.setOnClickListener {

        }

        return holder.bindView(CoffeeList[position], context)


    }

    inner class CoffeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val coffee_photo = itemView.findViewById<ImageView>(R.id.cup_img)
        private val coffeename = itemView.findViewById<TextView>(R.id.coffee_name)
        private val quantity = itemView.findViewById<TextView>(R.id.quantity)
        private val price = itemView.findViewById<TextView>(R.id.price)
        private val innerLayout = itemView.findViewById<ConstraintLayout>(R.id.inner_layout)
        private val resultMoney = itemView.findViewById<TextView>(R.id.result_money)

        fun bindView(coffee: Coffee, context: Context) {

            var totalMoney = 50000
            var americano = 3600
            var latte = 4600
            var cocoa = 4000
            var cake = 5000
            var q1 = 15
            var q2 = 12
            var q3 = 7
            var q4 = 4

            if (coffee.coffee_img != "") {
                val resourceId = context.resources.getIdentifier(coffee.coffee_img, "drawable", context.packageName)
                coffee_photo.setImageResource(resourceId)
            } else {
                coffee_photo.setImageResource(R.mipmap.ic_launcher)
            }
            coffeename.text = coffee.coffee_name
            quantity.text = coffee.quantity
            price.text = coffee.price

            innerLayout.setOnClickListener {
                when (coffee.coffee_name) {
                    "Americano" -> {
                        totalMoney -= americano
                        q1--
                        price.text = q1.toString()
                        resultMoney.text = "My Money - ${totalMoney.toString()}₩"
                        if(q1 == 0){
                            coffeename.text = "SOLD OUT"

                        }
                    }
                    "Latte" -> {
                        totalMoney -= latte
                        q2--
                        price.text = q2.toString()
                        resultMoney.text = "My Money - ${totalMoney.toString()}₩"
                    }
                    "Cocoa" -> {
                        totalMoney -= cocoa
                        q3--
                        price.text = q3.toString()
                        resultMoney.text = "My Money - ${totalMoney.toString()}₩"
                    }
                    "Cake" -> {
                        totalMoney -= cake
                        q4--
                        price.text = q4.toString()
                        resultMoney.text = "My Money - ${totalMoney.toString()}₩"
                    }
                    else -> {
                        Unit
                    }
                }
            }


        }


    }

}