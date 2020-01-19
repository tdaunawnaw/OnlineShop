package com.example.shoponline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoponline.Model.choose
import com.example.shoponline.Model.product
import com.example.shoponline.Model.shop
import com.example.shoponline.adapter.ChooseAdapter
import com.example.shoponline.adapter.PopularAdapter
import com.example.shoponline.adapter.ShopAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        latestitemview()
        propularView()
        chooseView()
    }

    fun  latestitemview(){

        var latestRecyclerView: RecyclerView =findViewById(R.id.latest_recycler)

        var latestList=ArrayList<shop>()
        latestList.add(
            shop(R.drawable.bag,"Hyde Park","N21","Limited Bag",
            R.drawable.rating,R.drawable.rating,R.drawable.rating,R.drawable.rating,
            R.drawable.emptyrating,45000))
        latestList.add(shop(R.drawable.shirt2,"Shoulder off","N22","Limited shirt",
            R.drawable.rating,R.drawable.rating,R.drawable.rating,R.drawable.rating,
            R.drawable.emptyrating,55000))
        latestList.add(shop(R.drawable.skirt,"Short skirt","N23","Limited skirt",
            R.drawable.rating,R.drawable.rating,R.drawable.rating,R.drawable.rating,
            R.drawable.emptyrating,87000))

        val shopAdapter=ShopAdapter(latestList)

        latestRecyclerView.layoutManager=
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)

        latestRecyclerView.adapter=shopAdapter

    }
    fun propularView(){

        var popularRecyclerView:RecyclerView=findViewById(R.id.popular_recycler)

        var productList=ArrayList<product>()
        productList.add(product("New","30% off","Iphone 8 Plus","Apple",R.drawable.rating,R.drawable.rating,R.drawable.rating,R.drawable.rating,R.drawable.emptyrating,670000,R.drawable.iphone8))
        productList.add(product("New","35% off","Ghost Bed","Bed",R.drawable.rating,R.drawable.rating,R.drawable.rating,R.drawable.rating,R.drawable.emptyrating,670000,R.drawable.ghostbed))
        productList.add(product("New","40% off","Nintento","Game",R.drawable.rating,R.drawable.rating,R.drawable.rating,R.drawable.rating,R.drawable.emptyrating,670000,R.drawable.nintento))
        productList.add(product("New","20% off","Dress","Beautiful",R.drawable.rating,R.drawable.rating,R.drawable.rating,R.drawable.rating,R.drawable.emptyrating,670000,R.drawable.dress))

        var popularadapter=PopularAdapter(productList)

        popularRecyclerView.layoutManager=LinearLayoutManager(this)

        popularRecyclerView.adapter=popularadapter
    }

    fun chooseView(){
        var chooseRecyclerView:RecyclerView=findViewById(R.id.choose_recycler)

        var chooseList=ArrayList<choose>()
        chooseList.add(choose(R.drawable.korea,R.drawable.japan2,R.drawable.singapore,R.drawable.china2))

        var chooseAdapter=ChooseAdapter(chooseList)


        chooseRecyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        chooseRecyclerView.adapter=chooseAdapter
    }

}
