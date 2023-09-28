package com.example.hellovienna;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greeting from \uD83D\uDCE6 Cloud Native Buildpacks with pack and \uD83C\uDF31 Spring Boot REST!"; // Package + Seedling
	}

	@GetMapping("/host")
	public String hostname() {
		String message = "Generation 1 running on: " + System.getenv("HOSTNAME");
		return message;
	}
	
}
