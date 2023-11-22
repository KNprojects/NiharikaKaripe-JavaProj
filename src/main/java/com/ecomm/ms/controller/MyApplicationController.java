package com.ecomm.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyApplicationController {

	@GetMapping
	public String getMessage() {
		return "Welcome to My application Deployed in AWS Cloud";
	}
}
