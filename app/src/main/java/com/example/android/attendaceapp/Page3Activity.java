package com.example.android.attendaceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Page3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);

        ListView myListView = findViewById(R.id.mylistView);
        ArrayList<String> my_class = new ArrayList<>();
        my_class.add("Physics");
        my_class.add("Math");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this , android.R.layout.simple_dropdown_item_1line , my_class);

    }
}