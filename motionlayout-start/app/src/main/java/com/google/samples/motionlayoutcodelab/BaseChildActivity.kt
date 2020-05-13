package com.google.samples.motionlayoutcodelab

import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class BaseChildActivity: AppCompatActivity() {
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return false
    }
}