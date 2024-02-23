package com.example.disubcomponent.Computer;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = SofwareModule.class)
public interface SoftwareComponent {
    Software buildSoftware();
}
