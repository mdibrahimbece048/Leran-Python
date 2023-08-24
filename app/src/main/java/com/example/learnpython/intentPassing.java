package com.example.learnpython;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class intentPassing extends AppCompatActivity {
    Handler handler;

    Intent iHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_passing);

        handler=new Handler();

        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                iHome=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(iHome);
                finish();
            }
        },3000);
    }
}