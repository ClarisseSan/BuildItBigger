package com.example.jokeactivity;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

public class JokeActivity extends ActionBarActivity implements JokeFragment.OnFragmentInteractionListener {

    public static String joke = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
