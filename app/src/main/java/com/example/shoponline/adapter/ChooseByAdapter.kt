package com.example.shoponline.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoponline.Model.choose
import com.example.shoponline.R
import kotlinx.android.synthetic.main.choosebycountry.view.*

class ChooseViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
    var image=ItemView.findViewById<ImageView>(R.id.korea)

}

class ChooseAdapter(var chooseList: ArrayList<choose>):RecyclerView.Adapter<ChooseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChooseViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.choosebycountry,parent,false)
        return ChooseViewHolder(view)
    }

    override fun getItemCount(): Int {
        return chooseList.size
    }

    override fun onBindViewHolder(holder: ChooseViewHolder, position: Int) {
        holder.image.setImageResource(chooseList[position].image)

    }

}