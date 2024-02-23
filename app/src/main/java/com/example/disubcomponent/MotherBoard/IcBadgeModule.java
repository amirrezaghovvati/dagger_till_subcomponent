package com.example.disubcomponent.MotherBoard;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class IcBadgeModule {
    @Binds
    abstract IcBadge createIcBadge(BadgeCreator badgeCreator);
}
