package com.example.disubcomponent.Mobile;

import dagger.Module;
import dagger.Provides;

@Module
public class StorageModule {
    @Provides
    public Storage provideStorage(){
      return new Storage();
    }
}
