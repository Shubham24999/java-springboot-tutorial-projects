package com.rest.post.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.post.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {

}
