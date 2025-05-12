package com.example.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restapi.entity.Students;
import com.example.restapi.model.StudentModel;
import com.example.restapi.repository.StudentsRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentsRepository studentsRepository;


    public List<StudentModel> sentStudentData() {

        List<StudentModel> studentModelList = new ArrayList<>();

        List<Students> studentDataList= (List<Students>) studentsRepository.findAll();

        for (Students student : studentDataList) {
            StudentModel studentModel = new StudentModel();
            studentModel.setName(student.getName());
            studentModel.setAge(student.getAge());
            studentModel.setId(student.getId());

            System.out.println("Student data: " + studentModel);

            studentModelList.add(studentModel);
        }

        return studentModelList;
    }

    public Students saveStudentData(StudentModel studentData) {
        // Logic to save student data
        System.out.println("Student data saved: " + studentData);

        Students student = new Students();
        student.setName(studentData.getName());
        student.setAge(studentData.getAge());

        return studentsRepository.save(student);
    }

    
}
