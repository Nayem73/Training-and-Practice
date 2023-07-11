package com.Nayem.self_training_amigos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(path = "/api/training/student")
public class SelfTrainingAmigosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelfTrainingAmigosApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello! Printing!";
	}
}
