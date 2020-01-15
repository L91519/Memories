package com.example.memories.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.memories.model.Letter
import com.example.memories.R
import kotlinx.android.synthetic.main.activity_diary.*

class DiaryActivity : AppCompatActivity() {

    val adapter = DiaryRecyclerViewAdapter() {

    }

    val text = arrayOfNulls<Char>(180)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diary)

        rv_diary_content.adapter = adapter
        rv_diary_content.setHasFixedSize(true)
        initData(getString(R.string.dummy_string))
    }

    fun initData(value: String) {
        var tmpNum = 0;
        val datas = mutableListOf<Letter>()
        for (i in value) {
            text.set(tmpNum, i)
            tmpNum++
        }
        for (i in text) {
            datas.add(Letter(i?:' '))
        }
        adapter.setItems(datas as ArrayList<Letter>)
    }
}