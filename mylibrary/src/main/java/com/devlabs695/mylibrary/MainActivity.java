package com.devlabs695.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String joke = intent.getStringExtra("joke");
        Toast.makeText(this, joke, Toast.LENGTH_SHORT).show();
        TextView jokeEditText = (TextView)findViewById(R.id.jokeTextView);
        jokeEditText.setText(joke);
    }
}
