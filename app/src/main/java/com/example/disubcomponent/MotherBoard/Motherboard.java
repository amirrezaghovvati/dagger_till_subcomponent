package com.example.disubcomponent.MotherBoard;

import android.util.Log;

import javax.inject.Inject;

public class Motherboard {
    private IcBadge badge;
    private Cpu cpu;
    @Inject
    public Motherboard(IcBadge badge,Cpu cpu){
        this.badge=badge;
        this.cpu=cpu;
    }
    public void runMotherBoard(int i){
       badge.runBuffer(i);
    }
}
