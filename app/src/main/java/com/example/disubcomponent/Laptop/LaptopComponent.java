package com.example.disubcomponent.Laptop;

import android.os.Build;

import com.example.disubcomponent.Computer.AcitivityScope;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@AcitivityScope
@Subcomponent(modules = OutPutModule.class)
public interface LaptopComponent {
    Laptop buildLaptop();

    @Subcomponent.Builder
    interface Builder{
        @BindsInstance
        Builder setI(@I int i);

        LaptopComponent buildLaptopComponent();

    }
}
