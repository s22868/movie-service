package com.example.demo.errHandlers;

import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;

import java.io.IOException;

public class MyErrorHandler extends DefaultResponseErrorHandler {
    @Override
    public void handleError(ClientHttpResponse response) throws IOException {

    }

}
