package com.example.admin1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.controller")
@ComponentScan("com.example.service")
@EntityScan("com.example.model")
@EnableJpaRepositories("com.example.repository")
public class Admin1Application {

	public static void main(String[] args) {
		SpringApplication.run(Admin1Application.class, args);
	}

}
