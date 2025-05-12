package com.example.restapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.restapi.entity.Students;

@Repository
public interface StudentsRepository extends CrudRepository<Students, Integer> {
   

    
} 
