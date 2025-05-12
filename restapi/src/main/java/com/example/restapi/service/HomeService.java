package com.example.restapi.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getHelloMessage() {
        return "Hello, New Updated World!";
    }
        
}
