package com.jfs.SpringSecurityApp.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        // If user not found then throw error
//        if(!username.equals("test")) {
//            throw new UsernameNotFoundException("User not found!");
//        }
//
//        // else it will create a user load that user
//        String encodedPassword = new BCryptPasswordEncoder().encode("test");
//        return User.withUsername("test").password(encodedPassword).roles("USER").build();

        String encodedPassword = new BCryptPasswordEncoder().encode("admin");
        if(username.equals("admin")) {
            return User.withUsername("admin").password(encodedPassword)
                    .roles("ADMIN")
                    .build();
        }
        throw new UsernameNotFoundException("User not found....");
    }

}
