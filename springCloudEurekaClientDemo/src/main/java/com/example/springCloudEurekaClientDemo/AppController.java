package com.example.springCloudEurekaClientDemo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/app")

public class AppController {
//	public String getProducts() {
//		return "products";
//	}
	@GetMapping(path="/product")
	public Response getProducts() {
		Product p1=new Product("Apple iphone",70000);
		Product p2=new Product("Mi",80000);
		Product p3=new Product("poco",60000);
		Product p4=new Product("one plius",50000);
		Product p5=new Product("Apple",40000);
		
		
		ArrayList<Product> products=new ArrayList<Product>();
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		
		Response response=new Response(101,"Products fetched successfully",products);
		return response;
		
	}

}
