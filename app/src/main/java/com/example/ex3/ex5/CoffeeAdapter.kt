package com.example.ex3.ex5

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
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
        return holder.bindView(CoffeeList[position], context)
    }

    inner class CoffeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val coffee_photo = itemView.findViewById<ImageView>(R.id.cup_img)
        private val coffeename = itemView.findViewById<TextView>(R.id.coffee_name)
        private val quantity = itemView.findViewById<TextView>(R.id.quantity)
        private val price = itemView.findViewById<TextView>(R.id.price)

        fun bindView(coffee: Coffee, context: Context) {

            if (coffee.coffee_img != "") {
                val resourceId = context.resources.getIdentifier(coffee.coffee_img, "drawable", context.packageName)
                coffee_photo.setImageResource(resourceId)
            } else {
                coffee_photo.setImageResource(R.mipmap.ic_launcher)
            }
            coffeename.text = coffee.coffee_name
            quantity.text = coffee.quantity
            price.text = coffee.price


        }


    }

}