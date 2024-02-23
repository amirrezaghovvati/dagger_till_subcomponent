package com.example.disubcomponent.Computer;

import javax.inject.Singleton;

import dagger.Component;
@AcitivityScope
@Component(dependencies = SoftwareComponent.class)
public interface ComputerComponent {
    Computer createComputer();

    @Component.Builder
    interface Builders{
        Builders setSoftWareComponent(SoftwareComponent component);

        ComputerComponent returnComputerComponent();
    }
}
