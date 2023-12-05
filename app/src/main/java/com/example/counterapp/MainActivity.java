package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int zeroNumStart = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button countButtVar = findViewById(R.id.countButt);
        TextView countingTextview = findViewById(R.id.startingNum);


        countButtVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                countingTextview.setText("" +IncreaseCounter());

            }
        });



    }

    public int IncreaseCounter(){
        return ++zeroNumStart;
    }
}