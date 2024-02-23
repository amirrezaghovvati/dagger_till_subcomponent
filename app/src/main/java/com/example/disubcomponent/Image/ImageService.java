package com.example.disubcomponent.Image;

import java.security.PublicKey;

import javax.inject.Inject;

public class ImageService {
    private ImageRequest imageRequest;
    @Inject
    public ImageService(ImageRequest imageRequest){
        this.imageRequest=imageRequest;
    }
    public void sendImageRequest(String url){
        this.imageRequest.sendImageRequest(url);
    }
}
