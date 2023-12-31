package com.example.counterapp;

import androidx.lifecycle.ViewModel;

public class AbuViewModel extends ViewModel {

    int zeroNumStart;

    public int getZeroNumStart() {
        return zeroNumStart;
    }

    public int IncreaseCounter(){

        return ++zeroNumStart;
    }

}
