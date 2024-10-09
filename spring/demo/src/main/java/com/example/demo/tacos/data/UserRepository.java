package com.example.demo.tacos.data;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.tacos.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
    User findByUsername(String username);

}
