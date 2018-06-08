package com.example.dsm2016.memories.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dsm2016.memories.activity.MemoryDetailActivity
import com.example.dsm2016.memories.R
import com.example.dsm2016.memories.model.Memory
//import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_memory.view.*

class MemoryAdapter(var items : ArrayList<Memory>, var context : Context) : RecyclerView.Adapter<MemoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MemoryViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context);
        val item = layoutInflater.inflate(R.layout.item_memory, parent, false);
        return MemoryViewHolder(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MemoryViewHolder?, position: Int) {
        holder?.itemView?.memoryTitle?.text = items.get(position).title;
//        Glide.with(context).load(items.get(position).pic1).into(holder?.itemView?.memoryPic1!!);
//        Glide.with(context).load(items.get(position).pic2).into(holder?.itemView?.memoryPic2!!);

        holder?.itemView?.setOnClickListener {
            val nextIntent = Intent(context, MemoryDetailActivity::class.java)
            context.startActivity(nextIntent)
        }
    }
}

class MemoryViewHolder(v: View) : RecyclerView.ViewHolder(v) {}