package com.example.crypton.kotlinbasics.retrofitbasics

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.crypton.R
import kotlinx.android.synthetic.main.github_item.view.*

class GithubRepoAdapter(var context: Context, var repoList: List<GithubRepoModel>) :
    RecyclerView.Adapter<GithubViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.github_item, parent, false)
        return GithubViewHolder(view)
    }

    override fun onBindViewHolder(holder: GithubViewHolder, position: Int) {
        var list: GithubRepoModel = repoList[position]
        holder.itemView.tvName.text = list.name

    }

    override fun getItemCount(): Int {
        return repoList.size
    }


}

class GithubViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)