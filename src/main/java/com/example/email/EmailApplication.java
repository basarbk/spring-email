package com.example.email;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class EmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailApplication.class, args);
	}

	@Bean
	@Profile("production")
	CommandLineRunner runProduction(@Value("${message}") String message){
		return (args) -> {
			System.err.println(message);
		};
	}

	@Bean
	@Profile("dev")
	CommandLineRunner runDevelopment(){
		return (args) -> {
			System.err.println("this will run in dev profile");
		};
	}

}
