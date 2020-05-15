package com.google.samples.motionlayoutcodelab.viewpager_lottie

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ViewPagerAdapter(fragmentManager: FragmentManager):
    FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val fragmentList = ArrayList<Fragment>()
    private val fragmentTitleList = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    fun addPage(s: String, layout: Int) {
        val page = Page()
        val arg = Bundle()
        arg.putInt("layout", layout)
        page.arguments = arg
        addFragment(page, s)
    }

    private fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }
}