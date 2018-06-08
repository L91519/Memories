package com.example.dsm2016.memories.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import com.example.dsm2016.memories.activity.MemoryActivity
import com.example.dsm2016.memories.R
import com.example.dsm2016.memories.model.Friend
import kotlinx.android.synthetic.main.item_friends.view.*

class FriendAdapter(val items: ArrayList<Friend>, val context: Context): RecyclerView.Adapter<MainViewHolder>(){

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

        holder.itemView.setOnClickListener{
            val nextIntent = Intent(context, MemoryActivity::class.java)
            context.startActivity(nextIntent)
        }
    }

}

class MainViewHolder(v: View): RecyclerView.ViewHolder(v) {

}

