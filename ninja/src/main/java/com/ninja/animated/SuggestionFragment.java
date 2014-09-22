package com.ninja.animated;



import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class SuggestionFragment extends Fragment {
    public static final String ARG_OBJECT = "object";

    private TextView mMovieSuggestionView;
    private View mRootView;
    private Resources mResources;
    private Random mRandom;
    private String[] mMovies;

    public SuggestionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mRootView = inflater.inflate(R.layout.fragment_suggestion, container, false);
        mMovieSuggestionView = (TextView) mRootView.findViewById(R.id.suggestions);
        mResources = getResources();
        mRandom = new Random();
        mMovies = mResources.getStringArray(R.array.movies);
        setMovieSuggestion(mMovieSuggestionView, pickMovie(mMovies));
        return mRootView;
    }

    private void setMovieSuggestion(TextView frame, String movie) {
        frame.setText(movie);
    }

    private String pickMovie(String[] movies) {
        Bundle args = getArguments();
        return movies[args.getInt(ARG_OBJECT) % movies.length];
    }
}