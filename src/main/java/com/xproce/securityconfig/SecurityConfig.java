// package com.xproce.securityconfig;

// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig extends WebSecurityConfigurerAdapter {
//     @Override
//     protected void configure(HttpSecurity http) throws Exception {
//         http
//             .authorizeRequests()
//                 .anyRequest().authenticated()
//                 .and()
//             .formLogin()
//                 .and()
//             .httpBasic();
//     }

//     @Override
//     protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//         auth
//             .inMemoryAuthentication()
//                 .withUser("user")
//                     .password(passwordEncoder().encode("password"))
//                     .roles("USER");
//     }

//     private Object passwordEncoder() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'passwordEncoder'");
//     }
// }
