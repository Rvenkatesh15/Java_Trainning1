package com.org.microservices.microservices2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.microservices.model.HelloService;

@RestController
public class HelloControler {
	@GetMapping("/showlimit")
	public HelloService retervieLimit() {
		return new HelloService(5000,9000);
	}
	

}
