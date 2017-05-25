package com.base7.jd.kotlindemo

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by jd on 25-May-17.
 */
class ViewPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    override fun getCount(): Int {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return 3
    }

    override fun getItem(position: Int): Fragment {
        //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return TryFragment()
    }

    override fun getPageTitle(position: Int): CharSequence {
        if (position == 0)
            return "First"
        else if (position == 1)
            return "Second"
        else
            return "Third"

    }
}