package com.devlabs695.jokes;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static String JOKE = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button getJoke = (Button) findViewById(R.id.getJokeButton);
        getJoke.setOnClickListener(this);

        //Intent jokeActivity = new Intent(this, com.devlabs695.mylibrary.MainActivity.class);
        //jokeActivity.putExtra(JOKE, MyClass.getJoke());
        //startActivity(jokeActivity);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.getJokeButton:
                new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "Manfred"));
                //Toast.makeText(this , MyClass.getJoke(), Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
