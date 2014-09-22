package com.ninja.animated;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity {

    MovieSwipeAdapter mMovieSwipeAdapter;
    ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Instantiate the movie adapter, that shows new movies recommendations on swype.
        mMovieSwipeAdapter = new MovieSwipeAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mMovieSwipeAdapter);
    }
}
