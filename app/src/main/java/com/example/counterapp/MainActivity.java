package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    AbuViewModel viewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button countButtVar = findViewById(R.id.countButt);
        TextView countingTextview = findViewById(R.id.startingNum);
        viewModel = new ViewModelProvider(this).get(AbuViewModel.class);


        countButtVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewModel.IncreaseCounter();
                ///////we took this out to make use live data
                //countingTextview.setText("" + viewModel.getZeroNumStart());
                /////////
            }
        });

        //we need to put the text here again in view model so it show the original state/data that was saved
        //countingTextview.setText("" + viewModel.getZeroNumStart());
        //////////////also commented this out to us live data, check prior commit


        //observing live data
        viewModel.getZeroNumStart().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {

                //updating ui according to live data
                countingTextview.setText("" + integer);

            }
        });




    }

}