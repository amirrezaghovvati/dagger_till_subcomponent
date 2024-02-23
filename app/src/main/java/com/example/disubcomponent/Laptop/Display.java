package com.example.disubcomponent.Laptop;

import android.util.Log;

import javax.inject.Inject;

public class Display implements Output{
    private int i;
    @Inject
    public Display(@I int i){
        this.i=i;
    }
    @Override
    public void outPut() {
        Log.i("TAG", "outPut number is =>"+i);
    }
}
