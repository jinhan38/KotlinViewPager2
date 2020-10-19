package com.kotlinviewpager2

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_intro_pager_item.view.*

class MyPagerViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    private val itemImage = itemView.pager_item_image
    private val itemContent = itemView.pager_item_text
    private val itemBackground = itemView.pager_item_bg


    fun bindWithView(pagerItem: PageItem) {
        itemImage.setImageResource(pagerItem.imageSource)
        itemContent.text = pagerItem.content
        itemBackground.setBackgroundResource(pagerItem.bgColor)
    }
}