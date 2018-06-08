package com.example.dsm2016.memories.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.dsm2016.memories.R
import com.example.dsm2016.memories.adapter.MemoryAdapter
import com.example.dsm2016.memories.model.Memory
import kotlinx.android.synthetic.main.activity_memory.*

class MemoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memory)

        val memories = ArrayList<Memory>()

        for(i in 1..5) {
            memories.add(Memory("data:image/jpeg;base64,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",
                    "data:image/jpeg;base64,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",
                    "title" + i))
        }

        memoryRecyclerView.layoutManager = LinearLayoutManager(this)
        memoryRecyclerView.adapter = MemoryAdapter(memories, applicationContext)
    }

}