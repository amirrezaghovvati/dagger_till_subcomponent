package com.example.disubcomponent.Laptop;

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = InputModule.class)
public interface InputsComponent {
   LaptopComponent.Builder buildLaptopComponent();
}
