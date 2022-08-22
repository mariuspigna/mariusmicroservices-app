package com.mariusmicroservices.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = { "com.mariusmicroservices.repository"})
@EntityScan(basePackages = { "com.mariusmicroservices.model"})
@ComponentScan(basePackages = { "com.mariusmicroservices.services","com.mariusmicroservices.controler"})
public class MicrowebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrowebappApplication.class, args);
	}

}
