package com.example.csse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity {

    Button btnActivityTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btnActivityTwo=findViewById(R.id.buttonActivtyTwo);

        //GetSupport
        getSupportActionBar().setTitle("Activity 2");//ActionBarName
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        //Intent Class
        btnActivityTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a3=new Intent(ActivityTwo.this,ActivityThree.class);
                startActivity(a3);
            }
        });





    }//Oncreate
}//class