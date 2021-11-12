package com.example.crypton

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DemoAdapter(val songs: List<DemoAdapterModel>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        //layout inflator class inflate convert xml component into java object
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout, parent,
            false
        )
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //binding data using holder and position
        holder.title.text = songs[position].title
        holder.desc.text = songs[position].desc
    }

    override fun getItemCount(): Int {
        return songs.size
    }
}


class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var title = itemView.findViewById<TextView>(R.id.tvTitle)
    var desc = itemView.findViewById<TextView>(R.id.tvDesc)


}