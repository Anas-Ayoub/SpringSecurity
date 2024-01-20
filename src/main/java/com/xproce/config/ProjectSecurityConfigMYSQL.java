package com.xproce.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

public class ProjectSecurityConfigMYSQL {
    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) { 
        return new JdbcUserDetailsManager(dataSource);
    }
    @Bean
    public PasswordEncoder passwordEncoder() { 
        return NoOpPasswordEncoder.getInstance();
    }
}
