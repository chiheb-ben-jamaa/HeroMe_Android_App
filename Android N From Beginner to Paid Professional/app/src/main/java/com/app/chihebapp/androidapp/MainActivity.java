package com.app.chihebapp.androidapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //set the String Message String :
    public static final String  message_send_activity1="";
    public static final String  message_send_activity2="";
    public static final String message_send_activity3="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO Insitalle the View :
        final LinearLayout weight=(LinearLayout)findViewById(R.id.weight);
        LinearLayout yoga=(LinearLayout)findViewById(R.id.yoga);
        LinearLayout Cardio=(LinearLayout)findViewById(R.id.Cardio);


        //TODO  Add OnClickListiner:
        //RQ for adding the Listiner into layout on add View.OnClickListener:
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Go to weight Acivity");
                Intent  i = new Intent(MainActivity.this,com.app.chihebapp.androidapp.weigth.class);
                i.putExtra("message_send_activity1", Color.red(1));
                startActivity(i);
            }
        });

        yoga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Go to yoga Acivity");
                Intent  i = new Intent(MainActivity.this, com.app.chihebapp.androidapp.yoga.class);
                i.putExtra("message_send_activity2",Color.blue(1));
                startActivity(i);
            }
        });

        Cardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Go to Cardio Acivity");
                Intent  i = new Intent(MainActivity.this,com.app.chihebapp.androidapp.cardio.class);
                i.putExtra("message_send_activity3",Color.green(1));
                startActivity(i);
            }
        });



    }

}

