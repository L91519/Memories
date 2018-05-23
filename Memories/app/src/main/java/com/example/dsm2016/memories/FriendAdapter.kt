package com.example.dsm2016.memories

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import kotlinx.android.synthetic.main.item_friends.view.*

class FriendAdapter(val items: ArrayList<Friend>): RecyclerView.Adapter<MainViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context);
        val item = layoutInflater.inflate(R.layout.item_friends, parent, false);
        return MainViewHolder(item);
    }

    override fun getItemCount(): Int {
        return items.size;
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder?.itemView?.friendName?.text = items.get(position).name;
        holder?.itemView?.friendIntro?.text = items.get(position).intro;
    }

}

class MainViewHolder(v: View): RecyclerView.ViewHolder(v) {}

