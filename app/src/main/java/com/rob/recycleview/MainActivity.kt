package com.rob.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val carlist = Datasource(this).getCarList()
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
//        recyclerView.layoutManager=LinearLayoutManager(this )
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false )
        recyclerView.adapter = CarAdapter(carlist)

    }
}