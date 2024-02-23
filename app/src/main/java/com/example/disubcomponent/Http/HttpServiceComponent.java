package com.example.disubcomponent.Http;

import dagger.Component;

@Component(modules = HttpRequestModule.class)
public interface HttpServiceComponent {
    HttpService createHttpService();
}
