package com.example.disubcomponent.Car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private GearBox gearBox;
    private Body body;
    @Inject
    public Car(GearBox gearBox, Body body) {
        this.gearBox = gearBox;
        this.body = body;
    }
    public void whatIsGearBox(){
        Log.i("TAG", "whatIsGearBox: "+gearBox);
        gearBox.gearBoxFifthGear();
    }
}
