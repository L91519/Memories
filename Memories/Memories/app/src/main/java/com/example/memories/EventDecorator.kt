package com.example.memories

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import com.prolificinteractive.materialcalendarview.CalendarDay
import com.prolificinteractive.materialcalendarview.DayViewDecorator
import com.prolificinteractive.materialcalendarview.DayViewFacade
import java.util.*
import kotlin.collections.HashSet

class EventDecorator(context : Context) : DayViewDecorator {

    val calendar : Calendar = Calendar.getInstance()
    var highlightDrawable : Drawable? = null
    var date : CalendarDay? = null
    var context : Context? = null


    init {
        this.context = context
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            this.highlightDrawable = ColorDrawable(context.resources.getColor(R.color.colorPrimary, context.theme))
        }
        this.date = CalendarDay.from(calendar)
    }

    override fun shouldDecorate(day: CalendarDay?): Boolean {
        day?.copyTo(calendar)
        val weekDay = calendar.get(Calendar.DAY_OF_WEEK)
        return date != null && day!!.equals(date)
    }

    override fun decorate(view: DayViewFacade?) {
        view?.setSelectionDrawable(context!!.applicationContext.getDrawable(R.drawable.date_selected_indicator)!!)
        highlightDrawable?.let { view?.setBackgroundDrawable(it) }
    }
}