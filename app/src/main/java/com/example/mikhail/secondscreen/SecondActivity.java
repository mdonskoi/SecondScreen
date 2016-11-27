package com.example.mikhail.secondscreen;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

//    @Override
//    protected void onCreate(Bundle saveInstanceState) {
//
//        super.onCreate(saveInstanceState);
//        setContentView(R.layout.activity_second);
//
//        String user = "ЖЫвотное";
//        String gift = "дырку от бублика";
//
//        TextView infoTextView = (TextView)findViewById(R.id.about_content);
//        infoTextView.setText(user + " , вам передали " + gift);
//
//    }

}
