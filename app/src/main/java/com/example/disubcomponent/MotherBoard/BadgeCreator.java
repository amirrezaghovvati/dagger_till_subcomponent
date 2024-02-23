package com.example.disubcomponent.MotherBoard;

import android.util.Log;

import javax.inject.Inject;

public class BadgeCreator implements IcBadge{
    @Inject
    public BadgeCreator(){}
    @Override
    public void runBuffer(int i) {
        Log.i("TAG", "Motherboard is started!");
    }
}
