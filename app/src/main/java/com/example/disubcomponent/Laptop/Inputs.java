package com.example.disubcomponent.Laptop;

import javax.inject.Inject;

public class Inputs {
    private Keyboard keyboard;
    private Mouse mouse;
    @Inject
    public Inputs(Keyboard keyboard,Mouse mouse){
        this.keyboard=keyboard;
        this.mouse=mouse;
    }
}
