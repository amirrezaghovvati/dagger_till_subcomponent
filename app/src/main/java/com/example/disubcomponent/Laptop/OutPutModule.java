package com.example.disubcomponent.Laptop;

import com.example.disubcomponent.Computer.AcitivityScope;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class OutPutModule {
    @AcitivityScope
    @Binds abstract Output buildOutPut(Display display);
}
