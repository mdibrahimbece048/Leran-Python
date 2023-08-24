package com.example.learnpython;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PythonPrograms extends AppCompatActivity {
    Button btn;
    Intent iNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_programs);
    }

    public void python(View view) {
        Button currentButton;
        currentButton = (Button) view;
        int id;
        id = currentButton.getId();
        if (id == R.id.python2) {
            iNext=new Intent(getApplicationContext(), ifElse.class);
            startActivity(iNext);
        }
        else if (id==R.id.python4) {
            iNext=new Intent(getApplicationContext(), nestedIf.class);
            startActivity(iNext);
        }
        else if (id==R.id.python5) {
            iNext=new Intent(getApplicationContext(), rangeProgram.class);
            startActivity(iNext);
        }
        else if (id==R.id.python6) {
            iNext=new Intent(getApplicationContext(), forLoopProgram.class);
            startActivity(iNext);

        }
        else if (id==R.id.python7) {
            iNext=new Intent(getApplicationContext(), whileProgram.class);
            startActivity(iNext);

        }
        else if (id==R.id.python8) {
            iNext=new Intent(getApplicationContext(), listProgram.class);
            startActivity(iNext);

        }
        else if (id==R.id.python9) {
            iNext=new Intent(getApplicationContext(), listFunctionProgram.class);
            startActivity(iNext);

        }
        else if (id==R.id.python11) {
            iNext=new Intent(getApplicationContext(), tupleProgram.class);
            startActivity(iNext);

        }
        else if (id==R.id.python12) {
            iNext=new Intent(getApplicationContext(), dictProgram.class);
            startActivity(iNext);

        }
        else if (id==R.id.python13) {
            iNext=new Intent(getApplicationContext(), functionProgram.class);
            startActivity(iNext);

        }
        else {
            iNext=new Intent(getApplicationContext(), mathFunctionProgram.class);
            startActivity(iNext);

        }

    }
}