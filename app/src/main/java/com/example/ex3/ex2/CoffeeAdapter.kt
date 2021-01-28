package com.example.ex3.ex2

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ex3.R

class CoffeeAdapter(val context: Context, val coffeeList: ArrayList<Coffee>) :
    RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CoffeeAdapter.CoffeeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return CoffeeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return coffeeList.size
    }

    override fun onBindViewHolder(holder: CoffeeAdapter.CoffeeViewHolder, position: Int) {
        return holder.bindView(coffeeList[position])
    }


    inner class CoffeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val coffeeName1 = itemView.findViewById<TextView>(R.id.textView1)
        val coffeeName2 = itemView.findViewById<TextView>(R.id.textView2)
        val coffeeContent = itemView.findViewById<TextView>(R.id.textView3)
        val coffeePhoto = itemView.findViewById<ImageView>(R.id.imageView1)
        val arrow = itemView.findViewById<ImageView>(R.id.imageView2)

        fun bindView(coffee: Coffee) {
            if (coffee.photo != "") {
                val resourceId =
                    context.resources.getIdentifier(coffee.photo, "drawable", context.packageName)
                coffeePhoto.setImageResource(resourceId)
            } else {
                coffeePhoto.setImageResource(R.mipmap.ic_launcher)
            }
            /* 나머지 TextView와 String 데이터를 연결한다. */
            coffeeName1.text = coffee.coffeeName1
            coffeeName2.text = coffee.coffeeName2
            coffeeContent.text = coffee.coffeeContent
        }


    }


}