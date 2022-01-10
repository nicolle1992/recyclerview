package com.example.trabajorecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RickAdapter ( var morthyList: List<String>): RecyclerView.Adapter<ViewHolder>(){

//class RickAdapter(var rickList:List<RickAndMorty>, var context:Context): RecyclerView.Adapter<RickAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RickAdapter.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.item_rick, parent, false)
        return ViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: RickAdapter.ViewHolder, position: Int) {
        val rick = rickList[position]

    }

    override fun getItemCount(): Int {
        return rickList.size
    }

    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        lateinit var iv:ImageView
        lateinit var title:TextView

        fun bind(itemview:View){
            iv = itemview.findViewById(R.id.iv_caracter)
            title = itemview.findViewById(R.id.tv_title)
        }


    }

}