package com.example.disubcomponent.Image;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class Picasso implements ImageRequest{
    private String url;
    @Inject
    public Picasso(@Url String url){
        this.url=url;
    }
    @Override
    public void sendImageRequest(String url) {
        Log.i("TAG", "sendImageRequest: "+url);
    }
}
