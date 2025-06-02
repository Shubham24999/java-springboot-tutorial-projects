package com.rest.post.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.post.helper.RequestResponse;
import com.rest.post.model.UserModel;
import com.rest.post.service.UserDetailsService;

@RestController
public class UserDetailsController {

    @Autowired
    private UserDetailsService userDetailsService;

    @PostMapping("/user/create")
    public RequestResponse createuserDetail(@RequestBody UserModel userData) {

       return userDetailsService.createUserDetails(userData);

    }

    @PostMapping("/user/get")
    public RequestResponse getUsers() {

        return userDetailsService.getUsers();

    }
    
    @PostMapping("/user/update")
    public RequestResponse postMethodName(@RequestBody UserModel userData) {
        
        return userDetailsService.updateUser(userData);
    }
    
}
