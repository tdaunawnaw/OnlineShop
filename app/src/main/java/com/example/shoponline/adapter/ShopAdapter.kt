package com.example.shoponline.adapter

import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shoponline.Model.shop
import com.example.shoponline.R


class ShopViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
    var image=ItemView.findViewById<ImageView>(R.id.imagelatest)
    var narme = ItemView.findViewById<TextView>(R.id.name_latest)
    var count = ItemView.findViewById<TextView>(R.id.count_latest)
    var namelouis = ItemView.findViewById<TextView>(R.id.louis)
    var imgrating = ItemView.findViewById<ImageView>(R.id.imagerating)
    var imgrating2 = ItemView.findViewById<ImageView>(R.id.imagerating2)
    var imgrating3 = ItemView.findViewById<ImageView>(R.id.imagerating3)
    var imgrating4 = ItemView.findViewById<ImageView>(R.id.imagerating4)
    var imgemptyrate = ItemView.findViewById<ImageView>(R.id.imagerating5)
    var txtprice=ItemView.findViewById<TextView>(R.id.txtprice)

}

class ShopAdapter(val shopList: ArrayList<shop>) : RecyclerView.Adapter<ShopViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.shopitem, parent, false)
        return ShopViewHolder(view)
    }

    override fun getItemCount(): Int {
        return shopList.size
    }

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        holder.image.setImageResource(shopList[position].image)
        holder.narme.text=shopList[position].name
        holder.count.text=shopList[position].count
        holder.namelouis.text=shopList[position].namelouis
        holder.imgrating.setImageResource(shopList[position].imgrating)
        holder.imgrating2.setImageResource(shopList[position].imgrating2)
        holder.imgrating3.setImageResource(shopList[position].imgrating3)
        holder.imgrating4.setImageResource(shopList[position].imgrating4)
        holder.imgemptyrate.setImageResource(shopList[position].imgemptyrate)
        holder.txtprice.text=shopList[position].txtprice.toString()
    }


}