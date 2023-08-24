package com.example.learnpython;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private Button btn1;
    AdView adView;

    Intent iNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // step 1

        adView=findViewById(R.id.adView1);

        MobileAds.initialize(this);
        // step 2
        AdRequest adRequest=new AdRequest.Builder().build();
        // step 3
        adView.loadAd(adRequest);

    }
    public void click(View view){

        int id;
        Button buttonCurrent=(Button) view;
        id=buttonCurrent.getId();
        if (id==R.id.btn1m){
            iNext=new Intent(getApplicationContext(), recyclerBasicActivity.class);
            startActivity(iNext);
        }
        else if (id==R.id.btn2m){
            iNext=new Intent(getApplicationContext(), OOPinPython.class);
            startActivity(iNext);
        }
        else if (id==R.id.btn3m){
            iNext=new Intent(getApplicationContext(), PythonPrograms.class);
            startActivity(iNext);
        }
        else{
            iNext=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(iNext);
        }
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder exitDialog=new AlertDialog.Builder(this);

        exitDialog.setTitle("Exit");
        exitDialog.setMessage("Are you sure want to exit?");
        exitDialog.setIcon(R.drawable.baseline_logout_24);

        exitDialog.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                Toast.makeText(MainActivity.this, "Welcome back!", Toast.LENGTH_SHORT).show();

            }
        });
        exitDialog.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                MainActivity.super.onBackPressed();
            }
        });
        exitDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Learn more!", Toast.LENGTH_SHORT).show();
            }
        });

        exitDialog.show();
    }
}