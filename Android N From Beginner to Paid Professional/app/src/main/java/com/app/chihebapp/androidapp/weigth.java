package com.app.chihebapp.androidapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import static com.app.chihebapp.androidapp.MainActivity.message_send_activity1;
import static java.lang.Integer.parseInt;

public class weigth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weigth);
        Intent i=getIntent();
        // use the getStringExtra:
        String GetMessage=i.getStringExtra(MainActivity.message_send_activity1);
        ConstraintLayout bg_weight=(ConstraintLayout)findViewById(R.id.bg_weight);
        int ColorNumber = Integer.parseInt(GetMessage);
        bg_weight.setBackgroundColor(ColorNumber);



    }
}
