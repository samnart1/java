package com.example.taco_cloud.data;

import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.taco_cloud.User;
import com.example.taco_cloud.security.UserDetailsService;

public interface UserRepository extends CrudRepository<User, Long> {
    
    User findByUsername(String username);

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepo) {
        return username -> {
            var user = userRepo.findByUsername(username);
            if (user != null) return user;

            throw new UsernameNotFoundException("User '" + username + "' not found");
        };
    }
    
}
