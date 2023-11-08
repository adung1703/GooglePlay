package com.huudung.googleplay

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val data : ArrayList<ArrayItem>) : RecyclerView.Adapter<MyAdapter.Holder>(){
    class Holder(val i : View) : RecyclerView.ViewHolder(i) {
        val title = i.findViewById<TextView>(R.id.textView)
        val RV = i.findViewById<RecyclerView>(R.id.group_items)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.Holder {
        val iView = LayoutInflater.from(parent.context)
            .inflate(R.layout.group_items, parent, false)
        return Holder(iView)
    }

    override fun onBindViewHolder(holder: MyAdapter.Holder, position: Int) {
        holder.title.text = data[position].title
        holder.RV.adapter = AnAdapter(data[position].Items)
        holder.RV.layoutManager = LinearLayoutManager(holder.itemView.context, LinearLayoutManager.HORIZONTAL, false)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    class AnAdapter (val items : ArrayList<item>) : RecyclerView.Adapter<AnAdapter.ItemViewHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnAdapter.ItemViewHolder {
            val itemView = LayoutInflater.from(parent.context)
                .inflate(R.layout.item, parent, false)
            return ItemViewHolder(itemView)
        }

        override fun onBindViewHolder(holder: AnAdapter.ItemViewHolder, position: Int) {
            holder.icon.setImageResource(items[position].icon)
            holder.name.text = items[position].name
            holder.rate.text = items[position].rate
        }

        override fun getItemCount(): Int {
            return items.size
        }
        class ItemViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView) {
            val icon : ImageView
            val name : TextView
            val rate : TextView
            init {
                icon = itemView.findViewById(R.id.imageView)
                name = itemView.findViewById(R.id.name)
                rate = itemView.findViewById(R.id.rate)
            }
        }
    }
}