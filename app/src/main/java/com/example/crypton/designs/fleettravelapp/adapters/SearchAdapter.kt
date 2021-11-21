package com.example.crypton.designs.fleettravelapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.crypton.R
import com.example.crypton.designs.fleettravelapp.models.FleetModel

class SearchAdapter(var imageList: List<FleetModel>) : RecyclerView.Adapter<SearchViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.search_item, parent, false)
        return SearchViewHolder(view)
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        holder.searchImage.setImageResource(imageList[position].image)

    }

    override fun getItemCount(): Int {
        return imageList.size
    }


}

class SearchViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
    var searchImage = itemview.findViewById<ImageView>(R.id.ivSearch)

}