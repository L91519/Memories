package com.example.memories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.view.*

class CalendarReyclerViewAdapter(private val items : ArrayList<Date>) : RecyclerView.Adapter<CalendarReyclerViewAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_date, parent, false)
        return CalendarReyclerViewAdapter.ViewHolder(inflatedView)
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        holder.bind(items[position])

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item : Date) {}
    }

}