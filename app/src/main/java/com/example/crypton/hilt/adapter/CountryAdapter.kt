package com.example.crypton.hilt.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.crypton.R
import com.example.snowflakestest.data.CountryResponseItem
import kotlinx.android.synthetic.main.country_item_layout.view.*


class CountryAdapter(
    var context: Context,
    var countryList: ArrayList<CountryResponseItem>,
) :
    RecyclerView.Adapter<CountryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.country_item_layout, parent, false)
        return CountryViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        var dataList: CountryResponseItem = countryList[position]
        holder.itemView.tvCountryName.text = dataList.name

    }

    override fun getItemCount(): Int {
        return countryList.size
    }
}

class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

