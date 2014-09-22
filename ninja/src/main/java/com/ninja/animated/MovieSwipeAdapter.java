package com.ninja.animated;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

// Since this is an object collection, use a FragmentStatePagerAdapter,
// and NOT a FragmentPagerAdapter.
public class MovieSwipeAdapter extends FragmentStatePagerAdapter {
    public MovieSwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new SuggestionFragment();
        Bundle args = new Bundle();
        args.putInt(SuggestionFragment.ARG_OBJECT, i + 1);
        // Fragment returns a movie suggestion based on the argument.
        fragment.setArguments(args);
        return fragment;
    }

    // Must override, use some large number for now.
    @Override
    public int getCount() {
        return 100;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "OBJECT " + (position + 1);
    }
}