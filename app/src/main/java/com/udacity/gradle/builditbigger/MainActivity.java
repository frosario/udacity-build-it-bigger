package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.support.v4.util.Pair;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.example.frosario.jokesandroidlib.JokeActivity;


public class MainActivity extends ActionBarActivity {
    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) { return true; }
        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view){
//        String randomJoke = Jokes.getRandomJoke();
        Intent intent = new Intent(this, JokeActivity.class);
//        intent.putExtra("joke", randomJoke);
        startActivity(intent);
    }

    public void cloudJoke(View view){
        Log.d(TAG,"Trying cloud joke");
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Freddie"));
    }


}
