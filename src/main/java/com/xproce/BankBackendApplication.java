package com.xproce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankBackendApplication.class, args);
	}

	// @Bean
	// public PasswordEncoder passwordEncoder() {
	// 	return NoOpPasswordEncoder.getInstance();
	// }

	// @Bean
	// public BCryptPasswordEncoder getBCryptPasswordEncoder() { 
	// 	return new BCryptPasswordEncoder();
	// }

}
