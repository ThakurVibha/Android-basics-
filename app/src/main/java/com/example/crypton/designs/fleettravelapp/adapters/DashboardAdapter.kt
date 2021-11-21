package com.example.crypton.designs.fleettravelapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.crypton.R
import com.example.crypton.designs.fleettravelapp.models.FleetModel

class DashboardAdapter(var imageList: List<FleetModel>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_design, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(imageList[position].image)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }
}

class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
    var image = itemview.findViewById<ImageView>(R.id.ivItem)

}