package com.example.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onToggleButtonClicked(view: View) {
        val photo:ImageView=findViewById(R.id.photo)
        val image:Int = R.drawable.pear
        val description:String="This is pear"
        photo.setImageResource(image)
        photo.setContentDescription(description)

    }
}