package com.rest.post.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.post.entity.UserDetails;
import com.rest.post.helper.RequestResponse;
import com.rest.post.model.UserModel;
import com.rest.post.repository.UserDetailsRepository;

@Service
public class UserDetailsService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    public RequestResponse createUserDetails(UserModel userData){

        RequestResponse response = new RequestResponse();

        if (userData != null) {
            

            UserDetails newUser= new UserDetails();

            newUser.setName(userData.getName());
            newUser.setAbout(userData.getAbout());
            newUser.setAge(userData.getAge());


           response.setData(userDetailsRepository.save(newUser));
           
            response.setMessage("User details created successfully");
        }else {
            response.setMessage("User data is null");
        }


        return response;
    }



    public RequestResponse getUsers(){

        RequestResponse response = new RequestResponse();

        List<UserDetails> userList= (List<UserDetails>) userDetailsRepository.findAll();

        if (userList != null && !userList.isEmpty()) {
            response.setData(userList);
            response.setMessage("User details retrieved successfully");
        } else {
            response.setMessage("No user details found");
        }

        return response;
    }

    public RequestResponse updateUser(UserModel userdata){

        RequestResponse response = new RequestResponse();

        Optional<UserDetails> user=userDetailsRepository.findById(userdata.getId());

        if (user.isPresent()) {




            UserDetails existDetails = user.get();
            existDetails.setName(userdata.getName());
            existDetails.setAge(userdata.getAge());
            
            

            response.setData(userDetailsRepository.save(existDetails));
            response.setMessage("User details updated successfully");

            
        }else{
            response.setMessage("User not found");
            
        }






        return response;

    }
    
}
