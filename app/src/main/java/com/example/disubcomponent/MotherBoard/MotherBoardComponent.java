package com.example.disubcomponent.MotherBoard;

import dagger.Component;

@Component(modules = IcBadgeModule.class)
public interface MotherBoardComponent {
    Motherboard buildMotherBoard();
}
