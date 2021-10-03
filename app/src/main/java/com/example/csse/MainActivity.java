package com.example.csse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnActivityMain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivityMain=findViewById(R.id.buttonActivtyMain);
        btnActivityMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a2=new Intent(MainActivity.this,ActivityTwo.class);
                startActivity(a2);
            }
        });



    }//OnCreate
}//Class