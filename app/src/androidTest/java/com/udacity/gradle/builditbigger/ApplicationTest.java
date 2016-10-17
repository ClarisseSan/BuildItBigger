package com.udacity.gradle.builditbigger;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ApplicationTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        Log.e("CONTEXT", appContext.toString());

        assertEquals("com.udacity.gradle.builditbigger", appContext.getPackageName());
    }

    @Test
    public void testASynctask() throws Exception {
        // Context of the app under test.
        Context mContext = InstrumentationRegistry.getContext();

        EndpointAsyncTask endpointAsyncTask = new EndpointAsyncTask(mContext, new EndpointAsyncTask.AsyncResponse() {
            @Override
            public void processFinish(String output) {

                assertNotNull(output);
            }
        });
        endpointAsyncTask.execute();

    }


}