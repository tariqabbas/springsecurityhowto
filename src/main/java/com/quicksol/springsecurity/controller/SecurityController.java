package com.quicksol.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/test")
	public String helloWorld() {
		return "Happy New Year";
	}
}
