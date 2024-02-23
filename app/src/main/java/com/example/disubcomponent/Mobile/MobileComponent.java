package com.example.disubcomponent.Mobile;

import com.example.disubcomponent.MainActivity;

import dagger.Component;

@Component(modules = StorageModule.class)
public interface MobileComponent {
    Mobile buildMobile();
    void injectFields(MainActivity mainActivity);
}
