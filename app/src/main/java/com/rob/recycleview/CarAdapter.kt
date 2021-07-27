package com.rob.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarAdapter(val carList: Array<String>): RecyclerView.Adapter<CarAdapter.CarViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        CarViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.car_item, parent, false)
        )

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {

        val word=carList[position]
        holder.carTextView.text = word
        holder.carNumTextView.text="${position+1}/${carList.size}"

    }

    override fun getItemCount() = carList.size

    inner class CarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val carTextView: TextView = itemView.findViewById(R.id.car_text)
        val carNumTextView: TextView = itemView.findViewById(R.id.car_num_text)

    }
}

