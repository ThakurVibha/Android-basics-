package com.example.crypton.designs.furnitureapp.adpters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crypton.R
import com.example.crypton.designs.furnitureapp.fragments.CartFragment
import com.example.crypton.designs.furnitureapp.models.NewArrivalModel

class NewArrivalAdapter(var newArrivalList: ArrayList<NewArrivalModel>, var context: Context) :
    RecyclerView.Adapter<NewArrivalViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewArrivalViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.new_item, parent, false)
        return NewArrivalViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewArrivalViewHolder, position: Int) {
        holder.newArrivalImage.setImageResource(newArrivalList[position].image)
        holder.title.text = newArrivalList[position].title
        holder.price.text = newArrivalList[position].price
        holder.category.text = newArrivalList[position].category
        holder.name.text = newArrivalList[position].name
//        holder.ratingbar.numStars=newArrivalList[position]
        holder.itemView.setOnClickListener {
            var intent = Intent(context, CartFragment::class.java)
            context.startActivity(intent)
        }


    }

    override fun getItemCount(): Int {
        return newArrivalList.size
    }
}

class NewArrivalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var newArrivalImage = itemView.findViewById<ImageView>(R.id.ivNewArrival)
    var price = itemView.findViewById<TextView>(R.id.tvprice)
    var title = itemView.findViewById<TextView>(R.id.tvTitle)
    var category = itemView.findViewById<TextView>(R.id.tvNew)

    //    var ratingbar=itemView.findViewById<RatingBar>(R.id.ratingbar)
    var name = itemView.findViewById<TextView>(R.id.tvName)

}