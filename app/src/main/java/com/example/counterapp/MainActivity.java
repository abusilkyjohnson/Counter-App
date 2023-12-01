package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView startingNum = findViewById(R.id.startingNum);

        int zeroNumStart = 0;
        final boolean[] buttonTrigger = {false};
        Button countButtVar = findViewById(R.id.countButt);

        countButtVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(buttonTrigger[0] == false)
                {
                    buttonTrigger[0] = true;
                }
                else if (buttonTrigger[0] == true)
                {
                    buttonTrigger[0] = false;
                }
            }
        });


        while(buttonTrigger[0])
        {
            zeroNumStart++;
            Integer.toString(zeroNumStart);
        }

    }
}