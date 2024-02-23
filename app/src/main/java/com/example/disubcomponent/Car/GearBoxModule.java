package com.example.disubcomponent.Car;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class GearBoxModule {
    @Binds
   abstract GearBox buildGearBox(Engine engine);
}
