package com.example.disubcomponent;

import android.app.Application;

import com.example.disubcomponent.Car.CarComponent;
import com.example.disubcomponent.Car.DaggerCarComponent;
import com.example.disubcomponent.Computer.DaggerSoftwareComponent;
import com.example.disubcomponent.Computer.SoftwareComponent;
import com.example.disubcomponent.Laptop.DaggerInputsComponent;
import com.example.disubcomponent.Laptop.InputsComponent;

public class App extends Application {
    private CarComponent carComponent;
    private SoftwareComponent softwareComponent;
    private InputsComponent inputsComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        carComponent= DaggerCarComponent.create();
        softwareComponent= DaggerSoftwareComponent.create();
        inputsComponent= DaggerInputsComponent.create();
    }
    public CarComponent permanentCarComponent(){
        return carComponent;
    }
    public SoftwareComponent permanentSoftwareComponent(){
        return softwareComponent;
    }
    public InputsComponent permanentInputComponent(){
        return  inputsComponent;
    }
}
