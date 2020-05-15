package com.google.samples.motionlayoutcodelab.coordinator_layout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.google.android.material.appbar.AppBarLayout
import com.google.samples.motionlayoutcodelab.R
import kotlinx.android.synthetic.main.activity_coordinator_layout1.appbar_layout
import kotlinx.android.synthetic.main.activity_coordinator_layout1.motion_layout
import kotlinx.android.synthetic.main.activity_coordinator_layout2.*

class CoordinatorLayoutActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coordinator_layout2)
        coordinateMotion()
        Glide.with(this).load(getDrawable(R.drawable.roard))
            .transform(CircleCrop())
            .into(avatar)
    }


    private fun coordinateMotion() {
        appbar_layout.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { _, verticalOffset ->
            val seekPosition = - verticalOffset / appbar_layout.totalScrollRange.toFloat()
            motion_layout.progress = seekPosition
        })
    }
}