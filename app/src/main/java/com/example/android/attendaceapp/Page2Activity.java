package com.example.android.attendaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
    }
    public void onClickFunction(View view){
        Intent myIntent = new Intent(getBaseContext() , Page3Activity.class);
        startActivity(myIntent);
    }
}