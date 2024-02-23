package com.example.disubcomponent.Http;

import dagger.Module;
import dagger.Provides;

@Module
public class HttpRequestModule {
    private String method;
    public HttpRequestModule(String method){
        this.method=method;
    }
    @Provides
    String provideMethod(){
        return method;
    }
    @Provides
    public HttpRequest provideHttpRequest(Retrofit retrofit){
        return retrofit;
    }
}
