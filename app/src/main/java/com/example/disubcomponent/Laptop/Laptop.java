package com.example.disubcomponent.Laptop;

import android.util.Log;

import javax.inject.Inject;

public class Laptop {
    private Inputs inputs;
    private Output output;
    @Inject
    public Laptop(Inputs inputs,Output output){
        this.inputs=inputs;
        this.output=output;
    }
    public void startLapTop(){
        Log.i("TAG", "The addresses is ->"+inputs+"  ===  "+output);
    }
}
