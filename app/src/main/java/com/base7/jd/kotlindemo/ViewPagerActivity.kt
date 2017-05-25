package com.base7.jd.kotlindemo

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity

class ViewPagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val viewPager: ViewPager = findViewById(R.id.viewPager) as ViewPager

        val tabLayout: TabLayout = findViewById(R.id.tabLayout) as TabLayout

        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)

        tabLayout.setupWithViewPager(viewPager)
    }
}
