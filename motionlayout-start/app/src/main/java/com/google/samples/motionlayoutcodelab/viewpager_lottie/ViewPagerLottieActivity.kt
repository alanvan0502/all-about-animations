package com.google.samples.motionlayoutcodelab.viewpager_lottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.samples.motionlayoutcodelab.R
import kotlinx.android.synthetic.main.activity_view_pager_lottie.*

class ViewPagerLottieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager_lottie)

        val adapter =
            ViewPagerAdapter(
                supportFragmentManager
            )
        adapter.addPage("Page 1",
            R.layout.motion_16_viewpager_page1
        )
        adapter.addPage("Page 2",
            R.layout.motion_16_viewpager_page2
        )
        adapter.addPage("Page 3",
            R.layout.motion_16_viewpager_page3
        )
        pager.adapter = adapter
        tabs.setupWithViewPager(pager)
        motion_layout?.let {
            pager.addOnPageChangeListener(it)
        }
    }
}