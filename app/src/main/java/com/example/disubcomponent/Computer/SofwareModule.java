package com.example.disubcomponent.Computer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SofwareModule {
    @Singleton
    @Provides
    public Software createSoftware(){
        return new Software();
    }
}
