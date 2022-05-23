package com.example.collapsingtoolbarlayoutexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainViewPagerAdapter(fa:FragmentActivity) : FragmentStateAdapter(fa) {
    var data : List<Int> = listOf()
        set(value) {
            field= value
            notifyDataSetChanged()
        }

    override fun getItemCount(): Int = data.size

    override fun createFragment(position: Int): Fragment {
        val fragment = MainFragment()
        fragment.arguments = Bundle().apply {
            putInt(KEY, colorList[data[position]%5])
        }
        return fragment
    }

    companion object {
        const val KEY = "KEY"
        private val colorList = listOf(
            R.color.teal_200,
            R.color.teal_700,
            R.color.purple_200,
            R.color.purple_500,
            R.color.purple_700
        )
    }
}