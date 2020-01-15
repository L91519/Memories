package com.example.memories.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.memories.model.Letter
import com.example.memories.R
import kotlinx.android.synthetic.main.item_letter.view.*

class DiaryRecyclerViewAdapter(val onClick: () -> Unit) :
    RecyclerView.Adapter<DiaryRecyclerViewAdapter.ViewHolder>() {

    val items = mutableListOf<Letter>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val holder = ViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_letter, parent, false)
        )

        holder.itemView.setOnClickListener {
            onClick()
        }

        return holder
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Letter) {
            itemView.ev_diary_letter.setText(item.letter.toString())
        }
    }

    fun setItems(items: ArrayList<Letter>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

}