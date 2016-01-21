package com.example.frosario.jokesandroidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent = getIntent();
        try {
            String joke = intent.getStringExtra("joke");
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(joke);
        } catch (Exception e) {
            Log.d("JokeActivity", "Sorry, no joke for you :(  ");
        }
    }
}
