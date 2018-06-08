package com.example.dsm2016.memories.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.dsm2016.memories.R
import com.example.dsm2016.memories.adapter.DetailMemoryAdapter
import com.example.dsm2016.memories.adapter.MemoryAdapter
import com.example.dsm2016.memories.model.DetailMemory
import kotlinx.android.synthetic.main.activity_detail_memory.*

class MemoryDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_memory)

        val detailMemories = ArrayList<DetailMemory>()

        for(i in 1..5) {
            detailMemories.add(DetailMemory("title" + i, "-"))
        }

        detailMemoryRecyclerView.layoutManager = LinearLayoutManager(this)
        detailMemoryRecyclerView.adapter = DetailMemoryAdapter(detailMemories, applicationContext)
    }
}