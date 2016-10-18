package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jokeactivity.JokeActivity;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private static final String LOG_TAG = MainActivityFragment.class.getSimpleName();

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);


        Button btnJoke = (Button) root.findViewById(R.id.btnJoke);
        btnJoke.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
//                Joker joker = new Joker();
//                String joke = joker.getJoke();
//                Toast toast = Toast.makeText(getContext(), joke, Toast.LENGTH_LONG);
//                toast.show();

                //get jokes from API using asynctask
                EndpointAsyncTask endpointAsyncTask = new EndpointAsyncTask(getActivity(), new EndpointAsyncTask.AsyncResponse() {
                    @Override
                    public void processFinish(String output) {
                        Log.d(LOG_TAG, "Response From Asynchronous task: " + output);
                        String joke = output;
                        Intent intent = new Intent(getActivity(), JokeActivity.class);
                        intent.putExtra(JokeActivity.joke, joke);
                        startActivity(intent);

                    }
                });
                endpointAsyncTask.execute();

            }
        });


        return root;
    }
}
