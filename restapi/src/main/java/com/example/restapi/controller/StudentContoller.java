package com.example.restapi.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.StudentService;
import com.example.restapi.entity.Students;
import com.example.restapi.model.StudentModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class StudentContoller {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save-date")
    public Students saveStudentData(@RequestBody StudentModel studentData) {  
        return studentService.saveStudentData(studentData);
    }
//    "/get-student"
    @GetMapping()
    public List<StudentModel> getStudentList() {
        return studentService.sentStudentData();
    }
    
    
    
}
