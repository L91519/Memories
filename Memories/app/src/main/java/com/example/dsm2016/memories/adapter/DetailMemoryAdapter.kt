package com.example.dsm2016.memories.adapter

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dsm2016.memories.activity.MemoryDetailActivity
import com.example.dsm2016.memories.R
import com.example.dsm2016.memories.model.DetailMemory
import com.example.dsm2016.memories.model.Memory
import kotlinx.android.synthetic.main.item_detail_memory.view.*

class DetailMemoryAdapter(var items : ArrayList<DetailMemory>, var context : Context) : RecyclerView.Adapter<DetailMemoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DetailMemoryViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context);
        val item = layoutInflater.inflate(R.layout.item_detail_memory, parent, false);
        return DetailMemoryViewHolder(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: DetailMemoryViewHolder?, position: Int) {
        holder?.itemView?.detailMemoryTitle?.text = items.get(position).title;
    }
}

class DetailMemoryViewHolder(v: View) : RecyclerView.ViewHolder(v) {}