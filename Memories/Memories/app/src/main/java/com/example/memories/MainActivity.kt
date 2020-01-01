package com.example.memories

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.prolificinteractive.materialcalendarview.MaterialCalendarView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var decorator : EventDecorator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo : if user is not keeped logged in, go to login page or sign in page

        decorator = EventDecorator(applicationContext)

        materialCalendarView.setTopbarVisible(false)
        materialCalendarView.addDecorator(decorator)

        /*          Calendar Recyclerview
        val adapter = CalendarReyclerViewAdapter(calendarList)
        calendatRecyclerView.adapter = adapter

        val lm = StaggeredGridLayoutManager(7, StaggeredGridLayoutManager.VERTICAL)
        calendatRecyclerView.layoutManager = lm
        calendatRecyclerView.setHasFixedSize(true)
        */


    }

    fun initCalendarList(calendarList : ArrayList<Date>)
    {
        for (i in 0 until 34)
        {
            if(i > 2 && i < 33)
            {
                calendarList.add(i, Date((i - 2).toString(), "title" + i, 1))
            }
            else
            {
                calendarList.add(i, Date("0", "title0", 0))
            }
        }
    }
}
