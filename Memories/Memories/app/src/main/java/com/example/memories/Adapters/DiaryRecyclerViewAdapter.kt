package com.example.memories.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.memories.Models.Letter
import com.example.memories.R
import kotlinx.android.synthetic.main.item_letter.view.*

class DiaryRecyclerViewAdapter() :
    RecyclerView.Adapter<DiaryRecyclerViewAdapter.ViewHolder>() {

    val items = mutableListOf<Letter>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DiaryRecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_letter, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: DiaryRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Letter) {
            itemView.ev_diary_letter.setText(item.letter.toString())
        }
    }

    fun setItems(items : ArrayList<Letter>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

}