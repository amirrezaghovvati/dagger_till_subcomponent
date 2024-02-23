package com.example.disubcomponent.Laptop;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class InputModule {
    @Singleton
    @Provides
    public Mouse provideMouse(){
        return new Mouse();
    }

    @Singleton
    @Provides
    public Keyboard provideKeyboard(){
        return new Keyboard();
    }

    @Singleton
    @Provides
    public Inputs provideInput(Mouse mouse,Keyboard keyboard){
        return new Inputs(keyboard,mouse);
    }
}
