package com.example.recyclerviewassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*

class MyAdapter(val list: List<Mydata>, val clicker:Clicker): RecyclerView.Adapter<MyAdapter.ViewHolder>()

{

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val currentItem = list[position]
//        holder.image.setImageResource(currentItem.imageResource)
//        holder.name.text = currentItem.name
        holder.initialize(list[position],clicker)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView){
        var image:ImageView = itemView.ivProfilePicture
        var name :TextView = itemView.tvName

        fun initialize(item: Mydata,clicker: Clicker){
             image.setImageResource(item.imageResource)
            name.text = item.name

            itemView.setOnClickListener{
                clicker.onClickItem(item,adapterPosition)
            }
        }
    }
}

interface Clicker{
    fun onClickItem(item:Mydata, position:Int)
}