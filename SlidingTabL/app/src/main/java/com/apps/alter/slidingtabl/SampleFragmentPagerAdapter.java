package com.apps.alter.slidingtabl;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by jolabti on 3/10/17.
 */
public class SampleFragmentPagerAdapter  extends FragmentPagerAdapter{
    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };
    private Context context;
    public SampleFragmentPagerAdapter(android.support.v4.app.FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
