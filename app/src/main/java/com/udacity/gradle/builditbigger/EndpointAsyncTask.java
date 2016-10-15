package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.example.isse.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;

import java.io.IOException;

/**
 * Created by isse on 15/10/2016.
 * tutorial from:
 * https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
 */

public class EndpointAsyncTask extends AsyncTask<Object, Object, String> {
    private Context mContext;
    private static MyApi myApiService = null;
    private final String LOG_TAG = EndpointAsyncTask.class.getSimpleName();

    public EndpointAsyncTask(Context context) {
        this.mContext = context;
    }

    @Override
    protected String doInBackground(Object[] objects) {
        if (myApiService == null) {  // Only do this once
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    // options for running against local devappserver
                    // - 10.0.2.2 is localhost's IP address in Android emulator
                    // - turn off compression when running against local devappserver
                    .setRootUrl("http://192.168.1.1:8080/_ah/api/")
                    .setGoogleClientRequestInitializer(new GoogleClientRequestInitializer() {
                        @Override
                        public void initialize(AbstractGoogleClientRequest<?> request) throws IOException {
                            request.setDisableGZipContent(true);
                        }

                    });
            // end options for devappserver

            myApiService = builder.build();
        }

        String joke;

        try {
            joke = myApiService.displayJoke().execute().getJoke();
            Log.v(LOG_TAG, "joke->" + joke);
            return joke;

        } catch (IOException e) {
            Log.e(LOG_TAG, e.toString());
            return e.getMessage();
        }


    }


    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(mContext, result, Toast.LENGTH_LONG).show();
    }
}
