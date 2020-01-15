package com.example.memories.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.memories.model.Date
import com.example.memories.EventDecorator
import com.example.memories.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var decorator: EventDecorator? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //todo : if user is not keeped logged in, go to login page or sign in page

        decorator = EventDecorator(applicationContext)

        materialCalendarView.setTopbarVisible(false)
        materialCalendarView.addDecorator(decorator)
    }
}
