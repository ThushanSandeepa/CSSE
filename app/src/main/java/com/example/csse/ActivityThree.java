package com.example.csse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        //GetSupport-Action bar name
        getSupportActionBar().setTitle("Activity 3");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



    }//Oncreate
}//Class