package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.util.Log;


public class AsyncTest extends AndroidTestCase{
    String TAG = "AsyncTest";

    public void test() {
        //Test async task retrieves a non-empty string.
        String string = null;
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
        Context context = getContext();
        asyncTask.execute(new Pair<Context, String>(context, string));

        try {
            string = asyncTask.get();
        } catch (Exception e) {
            String errorMessage =  e.getMessage();
            Log.d(TAG,errorMessage);
        }

        assertNotNull(string);
    }
}
