package com.example.disubcomponent.Car;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = GearBoxModule.class)
public interface CarComponent {
    Car createCar();
}
