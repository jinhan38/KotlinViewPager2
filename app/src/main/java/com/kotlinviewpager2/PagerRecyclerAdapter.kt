package com.kotlinviewpager2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PagerRecyclerAdapter(private val pageList: ArrayList<PageItem>) :
    RecyclerView.Adapter<MyPagerViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyPagerViewHolder {
        return MyPagerViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.layout_intro_pager_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyPagerViewHolder, position: Int) {
        //데이터와 뷰를 묶음
        holder.bindWithView(pageList[position])
    }

    override fun getItemCount(): Int {
        return pageList.size
    }
}