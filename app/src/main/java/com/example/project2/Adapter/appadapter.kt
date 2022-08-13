package com.example.project2.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project2.R
import com.example.project2.model.appshop

class appadapter(private val dataset: List<appshop>,
                 private val context: Context) : RecyclerView.Adapter<appadapter.appViewHolder>() {//end adapter


    class appViewHolder(private val view : View) : RecyclerView.ViewHolder(view){

        val textView : TextView = view.findViewById(R.id.title)
        val imageView : ImageView = view.findViewById(R.id.itemimage)
    }// endviewholder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): appViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)

        return appViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: appViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.appStringId)
        holder.imageView.setImageResource(item.appImageId)
    }

    override fun getItemCount() = dataset.size


}

