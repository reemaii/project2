package com.example.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.project2.Adapter.appadapter
import com.example.project2.data.datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val appList = datasource().loadapp()

        // adapter
        val adapter = appadapter(appList, this)

        // recyclerView
        val recyclerView : RecyclerView = findViewById(R.id.rv_app)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
    }
}