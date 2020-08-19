package com.example.recyclerviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Clicker {
    private val list:List<Mydata> = arrayListOf(
        Mydata(R.drawable.image1,"Omu David"),
        Mydata(R.drawable.image1,"Timrin Timkwali",),
        Mydata(R.drawable.image1,"Olalekan Fagbemi"),
        Mydata(R.drawable.image1,"Chibuzor Osuala"),
        Mydata(R.drawable.image1,"Emmanuel Tutu"),
        Mydata(R.drawable.image1,"Oghenekome Omodo"),
        Mydata(R.drawable.image1,"Oyedele Samuel"),
        Mydata(R.drawable.image1,"Ransom Ahanmisi"),
        Mydata(R.drawable.image1,"Samuel Ochuba"),
        Mydata(R.drawable.image1,"Kingley Izundu"),
        Mydata(R.drawable.image1,"Victor Adebunmi"),
        Mydata(R.drawable.image1,"Oladapo Oladokun")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var adapter = MyAdapter(list,this)
        rvRecyclerView.adapter = adapter
        rvRecyclerView.layoutManager = LinearLayoutManager(this)
    }


    override fun onClickItem(item: Mydata, position: Int) {
        Toast.makeText(this,"${item.name} says hi",Toast.LENGTH_SHORT).show()
    }
}