package com.example.learnpython;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OOPinPython extends AppCompatActivity {

    Intent iNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oopin_python);

    }

    public void oopClick(View view) {
        Button buttonCurrent = (Button) view;
        int id = buttonCurrent.getId();
        if (id == R.id.ClassAdvanced) {

            iNext = new Intent(getApplicationContext(), classOOP.class);
            startActivity(iNext);
        } else if (id == R.id.objectAdvance) {
            iNext = new Intent(getApplicationContext(), object.class);
            startActivity(iNext);
        } else if (id == R.id.encapsulationAdvance) {
            iNext = new Intent(getApplicationContext(), encapsulation.class);
            startActivity(iNext);
        } else if (id == R.id.InheritanceAdvance) {

            iNext = new Intent(getApplicationContext(), Inheritance.class);
            startActivity(iNext);
        } else if (id == R.id.polymorphismAdvance) {

            iNext = new Intent(getApplicationContext(), Polymorphism.class);
            startActivity(iNext);
        } else if (id==R.id.constructor){
            iNext = new Intent(getApplicationContext(), Constructor.class);
            startActivity(iNext);

        }else {
            iNext = new Intent(getApplicationContext(), Dataabtraction.class);
            startActivity(iNext);
        }
    }
}