package com.example.mikhail.secondscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        String user = "ЖЫвотное";
        String gift = "дырку от бублика";
        String from;

        // user = getIntent().getExtras().getString("username");
        // gift = getIntent().getExtras().getString("gift");

        Intent intent = getIntent();
        user = intent.getStringExtra("com.example.mikhail.secondscreen.USERNAME");

        gift = getIntent().getStringExtra("com.example.mikhail.secondscreen.GIFT");

        from = getIntent().getStringExtra("com.example.mikhail.secondscreen.FROM");

        TextView infoTextView = (TextView) findViewById(R.id.textViewInfo);
        infoTextView.setText(user + " , Вам передали " + gift + " от " + from);


//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

}
