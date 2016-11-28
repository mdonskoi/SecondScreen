package com.example.mikhail.secondscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // setContentView(R.layout.activity_second);

        Button aboutButton = (Button) findViewById(R.id.button);
        Button secondButton = (Button) findViewById(R.id.button2);
        Button thirdButton = (Button) findViewById(R.id.button3);

        aboutButton.setOnClickListener(this);
        secondButton.setOnClickListener(this);
        thirdButton.setOnClickListener(this);

    }

    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.button:
                Intent intentFirst = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intentFirst);
                break;
            case R.id.button2:
                Intent intentSecond = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intentSecond);
                break;

            case R.id.button3: //Intent intentThird = new Intent(MainActivity.this, ThirdActivity.class);

                EditText userEditText = (EditText) findViewById(R.id.editTextUser);
                EditText giftEditText = (EditText) findViewById(R.id.editTextGift);
                EditText fromEditText = (EditText) findViewById(R.id.editTextFrom);

                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);

                intent.putExtra("com.example.mikhail.secondscreen.USERNAME", userEditText.getText().toString());
                intent.putExtra("com.example.mikhail.secondscreen.GIFT", giftEditText.getText().toString());
                intent.putExtra("com.example.mikhail.secondscreen.FROM", fromEditText.getText().toString());
                startActivity(intent);


                //  startActivity(intent);


        }


//        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
//        startActivity(intent);

//        Intent intentSecond = new Intent(MainActivity.this, SecondActivity.class);
//        startActivity(intentSecond);
        // TODO: 11/24/16 reassign correctly button Second

    }


}
