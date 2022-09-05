package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@RequestMapping("/message")
	public String returnResourceMessage() {
		return "Hello World from Spring Boot";
		
	}
}
