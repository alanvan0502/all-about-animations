/*
 *   Copyright (C) 2019 The Android Open Source Project
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.google.samples.motionlayoutcodelab.basic

import android.os.Bundle
import com.google.android.material.appbar.AppBarLayout
import com.google.samples.motionlayoutcodelab.BaseChildActivity
import com.google.samples.motionlayoutcodelab.R
import kotlinx.android.synthetic.main.activity_step8.*

class Step8Activity : BaseChildActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_step8)

        coordinateMotion()
    }

    private fun coordinateMotion() {
        appbar_layout.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { _, verticalOffset ->
            val seekPosition = - verticalOffset / appbar_layout.totalScrollRange.toFloat()
            motion_layout.progress = seekPosition
        })
    }
}
