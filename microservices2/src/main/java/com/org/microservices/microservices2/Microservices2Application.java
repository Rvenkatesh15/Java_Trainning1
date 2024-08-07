package com.org.microservices.microservices2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Microservices2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservices2Application.class, args);
	}

}
