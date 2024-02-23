package com.example.disubcomponent.Image;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ImageRequestModule {
    @Binds
    abstract ImageRequest buildImageRequest(Glide glide);
}
