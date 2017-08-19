package com.example.shubham.android_modules;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerActivity extends AppCompatActivity {

    String []dayofweek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);
        Spinner myspinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(SpinnerActivity.this,android.R.layout.simple_spinner_item, dayofweek);
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        myspinner.setAdapter(myAdapter);
    }
}
