package com.renatojobal.virtualcarnival

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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