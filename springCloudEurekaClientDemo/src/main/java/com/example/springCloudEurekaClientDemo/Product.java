package com.example.springCloudEurekaClientDemo;

public class Product {
	String name;
	Integer price;
	public Product() {
		
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Product(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	

}
