package com.example.dsm2016.memories.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import com.example.dsm2016.memories.R
import com.example.dsm2016.memories.adapter.FriendAdapter
import com.example.dsm2016.memories.model.Friend
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val friends = ArrayList<Friend>()

        for(i in 1..5) {
            friends.add(Friend(true, "-", "name" + i, "intro" + i, "-"))
        }

        friendRecyclerView.layoutManager = LinearLayoutManager(this)
        friendRecyclerView.adapter = FriendAdapter(friends, applicationContext)

        addFriendBtn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            var inflater : LayoutInflater = layoutInflater
            var view : View = inflater.inflate(R.layout.dialog_add_friend, null)
            builder.setView(view)
            val dialog = builder.create()
            dialog.window.setLayout(300,250)
            dialog.show()
        }
    }
}
