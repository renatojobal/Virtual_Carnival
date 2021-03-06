package com.renatojobal.virtualcarnival

import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Hide the status bar.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        } else {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        }
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()


        // Create an array with the drawables
        var bombs = arrayListOf<Drawable>()

        getDrawable(R.drawable.ic_bluebomb)?.let { bombs.add(it) }
        getDrawable(R.drawable.ic_greenbomb)?.let { bombs.add(it) }
        getDrawable(R.drawable.ic_redbomb)?.let { bombs.add(it) }
        getDrawable(R.drawable.ic_yellowbomb)?.let { bombs.add(it) }


        var imageView : ImageView = findViewById(R.id.imageView)

        imageView.setOnClickListener { it ->

            // Get random number


            imageView.setImageDrawable(bombs.random())
        }

    }



}