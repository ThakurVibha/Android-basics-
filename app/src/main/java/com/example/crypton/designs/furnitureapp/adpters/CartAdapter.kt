package com.example.crypton.designs.furnitureapp.adpters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crypton.R
import com.example.crypton.designs.furnitureapp.models.NewArrivalModel

class CartAdapter(var cartList: List<NewArrivalModel>) : RecyclerView.Adapter<CartViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.cart_item, parent, false)
        return CartViewHolder(view)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.cartImage.setImageResource(cartList[position].image)
        holder.name.text=cartList[position].name
        holder.price.text=cartList[position].price
        holder.category.text=cartList[position].category

    }

    override fun getItemCount(): Int {

        return cartList.size
    }
}

class CartViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){
    var cartImage = itemView.findViewById<ImageView>(R.id.ivCart)
    var price = itemView.findViewById<TextView>(R.id.tvPrice)
    var category = itemView.findViewById<TextView>(R.id.tvCategory)
    var name = itemView.findViewById<TextView>(R.id.tvName)

}