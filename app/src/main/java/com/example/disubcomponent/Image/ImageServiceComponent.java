package com.example.disubcomponent.Image;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = ImageRequestModule.class)
public interface ImageServiceComponent {
    ImageService buildImageService();

//    @Component.Builder
//    interface Builder{
//        @BindsInstance
//        Builder setUrl(@Named("url") String url);
//
//        ImageServiceComponent returnImagSerivceComponent();
//    }

    @Component.Factory
    interface Factory{
        ImageServiceComponent returnImageServiceComponent(@BindsInstance @Url String url);
    }
}
