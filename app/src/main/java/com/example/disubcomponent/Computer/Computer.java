package com.example.disubcomponent.Computer;

import android.util.Log;

import javax.inject.Inject;

public class Computer {
    private Hardware hardware;
    private Software software;
    @Inject
    public Computer(Hardware hardware,Software software){
        this.hardware=hardware;
        this.software=software;
    }
    public void computerTurnedOn(){
        Log.i("TAG", "computerTurnedOn: "+hardware+" == "+software);
    }
}
