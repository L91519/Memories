package com.example.memories.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.memories.model.Date
import com.example.memories.R
import kotlinx.android.synthetic.main.item_date.view.*

class CalendarReyclerViewAdapter(val itemClick: () -> Unit) :
    RecyclerView.Adapter<CalendarReyclerViewAdapter.ViewHolder>() {

    private val items = mutableListOf<Date>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {

        val holder = ViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(R.layout.item_date, parent, false)
        )

        holder.itemView.setOnClickListener{
            itemClick()
        }

        return holder
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Date) {
            itemView.date_date.text = item.date
            itemView.date_title.text = item.title
        }
    }

}