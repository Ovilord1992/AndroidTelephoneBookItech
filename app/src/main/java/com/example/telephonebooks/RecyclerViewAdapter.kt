package com.example.telephonebooks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.telephonebooks.model.UserItem

class RecyclerViewAdapter(val listData: List<UserItem>, val clickListener: ClickListener): RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val  view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return MyViewHolder(view)
    }


    override fun getItemCount(): Int {
        return listData.size
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        var userFullName: TextView

        init {
            userFullName = view.findViewById(R.id.fullNameList)
        }
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.userFullName.text = listData.get(position).userName
        holder.itemView.setOnClickListener {
            clickListener.onItemClick(listData.get(position))
        }
    }

    interface ClickListener {
        fun onItemClick(userItem: UserItem)
    }

}