package com.example.navbarpractice2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import com.google.android.material.appbar.MaterialToolbar




class MainActivity : AppCompatActivity() {

    lateinit var toolBar : MaterialToolbar


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        toolBar = findViewById(R.id.materialToolbar)
        toolBar.overflowIcon = AppCompatResources.getDrawable(this, R.drawable.baseline_read_more_24)

        toolBar.setNavigationOnClickListener {
            Toast.makeText(applicationContext, "Navigation is clicked", Toast.LENGTH_SHORT).show()
        }
        toolBar.setOnMenuItemClickListener { item->
            when(item.itemId){
                R.id.share -> Toast.makeText(applicationContext, "Navigation is clicked", Toast.LENGTH_SHORT).show()
                R.id.setting -> Toast.makeText(applicationContext, "Setting is clicked", Toast.LENGTH_SHORT).show()
                R.id.search -> Toast.makeText(applicationContext, "search is clicked", Toast.LENGTH_SHORT).show()
                R.id.thumb -> Toast.makeText(applicationContext, "Liked is clicked", Toast.LENGTH_SHORT).show()

            }

            return@setOnMenuItemClickListener true

        }
    }

}