package com.google.samples.motionlayoutcodelab.image_filter

import android.content.pm.ActivityInfo
import android.os.Bundle
import com.google.samples.motionlayoutcodelab.BaseChildActivity
import com.google.samples.motionlayoutcodelab.R

class ImageFilter2 : BaseChildActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_filter2)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
    }
}