package com.google.samples.motionlayoutcodelab

import android.content.pm.ActivityInfo
import android.os.Bundle

class ImageFilter2 : BaseChildActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_filter2)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
    }
}