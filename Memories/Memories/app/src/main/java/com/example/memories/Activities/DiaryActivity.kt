package com.example.memories.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.memories.Adapters.DiaryRecyclerViewAdapter
import com.example.memories.Models.Letter
import com.example.memories.R
import kotlinx.android.synthetic.main.activity_diary.*

class DiaryActivity : AppCompatActivity() {

    val adapter = DiaryRecyclerViewAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diary)

        rv_diary_content.adapter = adapter
        rv_diary_content.setHasFixedSize(true)
        initData(getString(R.string.dummy_string))
    }

    fun initData(text: String) {
        val datas = ArrayList<Letter>()
        for(i in text){
            datas.add(Letter(i))
        }
        adapter.setItems(datas)
    }
}