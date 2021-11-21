package com.example.crypton.designs.furnitureapp.adpters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.crypton.R
import com.example.crypton.designs.furnitureapp.models.NewArrivalModel

class CollectionsAdapter(var collectionList: ArrayList<NewArrivalModel>) :
    RecyclerView.Adapter<CollectionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.collection_item, parent, false)
        return CollectionViewHolder(view)
    }



    override fun getItemCount(): Int {
        return collectionList.size
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.newArrivalImage.setImageResource(collectionList[position].image)
    }
}

class CollectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var newArrivalImage = itemView.findViewById<ImageView>(R.id.ivCollection)

}
