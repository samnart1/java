package com.example.taco_cloud.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.example.taco_cloud.User;
import com.example.taco_cloud.data.UserRepository;

@Configuration
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public UserDetailsService userDetailsService(UserRepository userRepo) {
        return username -> {
            User user = userRepo.findByUsername(username);
            if (user != null) return user;

            throw new UsernameNotFoundException("User '" + username + "' not found");
        };
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/design", "/orders").hasRole("USER")
                .requestMatchers("/", "/**").permitAll()
            )
            .formLogin(form -> form
                .loginPage("/login")
                .defaultSuccessUrl("/design", true)
            )
            .oauth2Login(oauth -> oauth
                .loginPage("/login")
            )
            .logout(out -> out
                .logoutSuccessUrl("/")
            )
            .build();
    }

    // @Bean
    // public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    //     return http
    //         .authorizeRequests()
    //             .antMatchers("/design", "/orders").access("hasRole("USER")")
    //             .antMatchers("/", "/**").access("permitAll()")
    //         .and()
    //             .formLogin()
    //                 .loginPage("/login")
    //                 .defaultSucessUrl("/design", true)
    //                 // .loginProcessingUrl("/authenticate")
    //                 // .usernameParameter("user")
    //                 // .passwordParameter("pwd")
    //         .and()
    //         .build();
    // }
    
}
