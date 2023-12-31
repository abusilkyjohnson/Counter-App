package com.example.counterapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AbuViewModel extends ViewModel {


    ///// live data was added after video model and theyre not dependent look at your prior commit
    private MutableLiveData<Integer> zeroNumStart = new MutableLiveData<>();


    public LiveData<Integer> getZeroNumStart() {
        return zeroNumStart;
    }

    public void IncreaseCounter(){

                            // this the short hand for conditional statement
        int currentVal = zeroNumStart.getValue() != null ? zeroNumStart.getValue():0;

        //setValue is a method from livedate
        zeroNumStart.setValue(currentVal + 1 );
    }

}
