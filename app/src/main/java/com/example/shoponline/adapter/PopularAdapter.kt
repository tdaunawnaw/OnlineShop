package com.example.shoponline.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoponline.Model.product
import com.example.shoponline.R
import kotlinx.android.synthetic.main.popularproduct.view.*

class PoPularViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
    var btnnew=ItemView.findViewById<Button>(R.id.btn_new)
    var btnoff=ItemView.findViewById<Button>(R.id.btn_off)
    var txtproduct = ItemView.findViewById<TextView>(R.id.txt_product)
    var txtapple = ItemView.findViewById<TextView>(R.id.txt_apple)
    var ratingbar = ItemView.findViewById<RatingBar>(R.id.ratingbar)
    var txtprice=ItemView.findViewById<TextView>(R.id.txt_price)
    var imgproduct=ItemView.findViewById<ImageView>(R.id.image_product)
}


class PopularAdapter(val popularList: ArrayList<product>):RecyclerView.Adapter<PoPularViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PoPularViewHolder {
        var popular=LayoutInflater.from(parent.context).inflate(R.layout.popularproduct,parent,false)
        return PoPularViewHolder(popular)
    }

    override fun getItemCount(): Int {
        return popularList.size
    }

    override fun onBindViewHolder(holder: PoPularViewHolder, position: Int) {
        holder.btnnew.text=popularList[position].btnnew
        holder.btnoff.text=popularList[position].btnoff
        holder.txtproduct.text=popularList[position].txtproduct
        holder.txtapple.text=popularList[position].txtapple
        holder.ratingbar.textAlignment=(popularList[position].ratingbar)
        holder.txtprice.text=popularList[position].txtprice.toString()
        holder.imgproduct.setImageResource(popularList[position].imageproduct)

    }


}