package com.example.disubcomponent.Http;

import android.util.Log;

import javax.inject.Inject;

public class Retrofit implements HttpRequest{
    private String method;
    @Inject
    public Retrofit(String method){
        this.method=method;
    }
    @Override
    public void sendRequest(String url) {
        Log.i("TAG", "sendRequest: ->"+method);
    }
}
