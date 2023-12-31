package com.example.DarrensPetitions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import java.util.Collections;

@SpringBootApplication
@EnableAutoConfiguration
public class DarrensPetitionsApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DarrensPetitionsApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "9090"));
		app.run(args);
	}
}
