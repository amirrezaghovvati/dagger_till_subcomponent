package com.example.disubcomponent;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.disubcomponent.Car.Car;
import com.example.disubcomponent.Car.CarComponent;

import com.example.disubcomponent.Computer.Computer;
import com.example.disubcomponent.Computer.ComputerComponent;
import com.example.disubcomponent.Computer.DaggerComputerComponent;

import com.example.disubcomponent.Laptop.DaggerInputsComponent;
import com.example.disubcomponent.Laptop.Laptop;
import com.example.disubcomponent.Laptop.LaptopComponent;

public class SecondActivity extends AppCompatActivity {
    private Car car;
    private CarComponent carComponent;
    private ComputerComponent computerComponent;
    private Computer computer;
    private Laptop laptop;
    private LaptopComponent laptopComponent;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carComponent=((App)getApplication()).permanentCarComponent();
        car=carComponent.createCar();
        car.whatIsGearBox();
        //Computer
        computerComponent= DaggerComputerComponent.builder()
                .setSoftWareComponent(((App) getApplication()).permanentSoftwareComponent())
                .returnComputerComponent();
        computer=computerComponent.createComputer();
        computer.computerTurnedOn();
        //Laptop
    //    laptopComponent=((App) getApplication()).permanentInputComponent().buildLaptopComponent();

        laptopComponent=((App) getApplication()).permanentInputComponent().buildLaptopComponent().setI(8).buildLaptopComponent();
         laptop=laptopComponent.buildLaptop();
        laptop.startLapTop();
    }
}
