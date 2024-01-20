package com.xproce.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

// @Service
// public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

//     @Autowired
//     BCryptPasswordEncoder passwordEncoder;

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         // TODO Auto-generated method stub
//         Map<String, String> users = new HashMap<>(); 
//         users.put("yasser", "12345");
        
//         if (users.containsKey(username))
//         return new User(username, users.get(username), new ArrayList<>());
//         // if this is thrown, then we won't generate JWT token.
//         throw new UsernameNotFoundException(username);
//     }
    
// }
