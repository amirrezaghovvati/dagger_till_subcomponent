package com.example.disubcomponent.Http;

import android.util.Log;

import javax.inject.Inject;

public class Volley implements HttpRequest{
    private String method;
    @Inject
    public Volley(String method){
        this.method=method;
    }
    @Override
    public void sendRequest(String url) {
        Log.i("TAG", "sendRequest: =>"+method);
    }
}
