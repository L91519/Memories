package com.example.memories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_date.view.*

class CalendarReyclerViewAdapter(private val items : ArrayList<Date>) : RecyclerView.Adapter<CalendarReyclerViewAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_date, parent, false)
        return CalendarReyclerViewAdapter.ViewHolder(inflatedView)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item : Date) {
            itemView.date_date.text = item.date
            itemView.date_title.text = item.title
        }
    }

}