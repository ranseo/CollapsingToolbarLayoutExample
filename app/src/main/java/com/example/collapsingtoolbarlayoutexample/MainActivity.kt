package com.example.collapsingtoolbarlayoutexample

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.example.collapsingtoolbarlayoutexample.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MainViewPagerAdapter(this)
        binding.viewPager2.adapter = adapter

        adapter.data = listOf(1,2,3,4,5,6,7)


    }
}