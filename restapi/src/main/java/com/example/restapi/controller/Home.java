package com.example.restapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.service.HomeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Home {
    
    @Autowired
    private HomeService homeService;

    @GetMapping("/hello")
    public String sayHello() {
        return homeService.getHelloMessage();
    }
    
    
}
