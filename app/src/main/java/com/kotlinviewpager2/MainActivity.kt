package com.kotlinviewpager2

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    private var pageItemList = ArrayList<PageItem>()
    private lateinit var pagerRecyclerAdapter: PagerRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {                    
        super.onCreate(savedInstanceState)

        //Hide ActionBar
        supportActionBar?.hide()

        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.

        setContentView(R.layout.activity_main)


        //데이터 배열
        pageItemList.add(PageItem(R.color.red, R.drawable.ic_pager_item_1, "첫번째 페이지"))
        pageItemList.add(PageItem(R.color.orange, R.drawable.ic_pager_item_2, "두번째 페이지"))
        pageItemList.add(PageItem(R.color.green, R.drawable.ic_pager_item_3, "세번째 페이지"))

        pagerRecyclerAdapter = PagerRecyclerAdapter(pageItemList)

        my_intro_view_pager.apply {
            adapter = pagerRecyclerAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
            worm_dots_indicator.setViewPager2(this)

        }


        previous_btn.setOnClickListener {
            my_intro_view_pager.currentItem = my_intro_view_pager.currentItem - 1
        }


        next_btn.setOnClickListener {
            my_intro_view_pager.currentItem = my_intro_view_pager.currentItem + 1
        }

    }


}