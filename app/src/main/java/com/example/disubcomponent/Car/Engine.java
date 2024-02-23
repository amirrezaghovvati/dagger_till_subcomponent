package com.example.disubcomponent.Car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Engine implements GearBox{
    @Inject
    public Engine(){}
    @Override
    public void gearBoxFifthGear() {
        Log.i("TAG", "The GearBox is Fifth Gear!");
    }
}
