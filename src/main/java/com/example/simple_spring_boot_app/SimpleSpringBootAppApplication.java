package com.example.simple_spring_boot_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringBootAppApplication.class, args);
	}

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}

}
