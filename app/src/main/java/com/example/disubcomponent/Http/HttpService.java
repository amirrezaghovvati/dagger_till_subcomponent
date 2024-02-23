package com.example.disubcomponent.Http;

import javax.inject.Inject;

public class HttpService {
    private HttpRequest httpRequest;
    @Inject
    public HttpService(HttpRequest httpRequest){
        this.httpRequest=httpRequest;
    }
    public void sendRequestToWeb(String url){
        httpRequest.sendRequest(url);
    }
}
