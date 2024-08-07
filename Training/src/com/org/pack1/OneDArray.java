package com.org.pack1;


class Product{
	String name;
	int quantity;
	
	Product(String name,int quantity){
		this.name=name;
		this.quantity=quantity;
	}
}
class Address{
	String street;
	String city;
	String postal_code;
	
	Address(String street,String city,String postal_code){
		this.street=street;
		this.city=city;
		this.postal_code=postal_code;
	}
}

class Delivery{


	Product product;
	
	Address address;

	Delivery(Product product,Address address){
		this.product=product;
		this.address=address;
	}

	@Override
	public String toString() {
		return product.name+" "+product.quantity+" "+address.street+" "+address.city+" "+address.postal_code;
	}
	
	
	
	
}
class DeliveryManager{
	Delivery[] deliveries;
	int count;
	
	DeliveryManager(int size){
		deliveries=new Delivery[size];
		count=0;
	}
	
	void addDelivery(Product product,Address address) {
		if(count<deliveries.length) {
			deliveries[count++]=new Delivery(product, address);
		}else {
			System.out.println("Delivery List is full");
		}
	}
	void removeDelivery(int index) {
		if(index>=0 && index<count) {
			for(int i=index;i<count-1;i++) {
				deliveries[i]=deliveries[i+1];
			}
			deliveries[--count]=null;
		}else {
			System.out.println("Invalid index");
		}
	}
	void updateDelivery(int index,Product newProduct) {
		if(index>=0 && index<count) {
			deliveries[index].product=newProduct;
		}else {
			System.out.println("Invalid index");
		}
	}
	
	void updateDelivery(int index,Address newAddress) {
		if(index>=0 && index<count) {
			deliveries[index].address=newAddress;
		}else {
			System.out.println("Invalid index");
		}
	}
	void updateDelivery(int index,Product newProduct,Address newAddress) {
		if(index>=0 && index<count) {
			deliveries[index].product=newProduct;
			deliveries[index].address=newAddress;
		}else {
			System.out.println("Invalid");
		}
	}
	void displayDeliveries() {
		for(int i=0;i<count;i++) {
			System.out.println(deliveries[i]);
		}
	}
}

public class OneDArray {
	public static void main(String[] args) {
		DeliveryManager manager=new DeliveryManager(5);
		
		manager.addDelivery(new Product("Laptop",1), new Address("123 Main st","Springfield","12345"));
		manager.addDelivery(new Product("Phone",2), new Address("456 Elm st","Shelb","6789"));
		
		
		System.out.println("Deliveries: ");
		manager.displayDeliveries();
		
		
		
		manager.updateDelivery(0, new Product("Tablet",1));
		manager.updateDelivery(1, new Address("789 ookak st","capital city","13579"));
		
		System.out.println("\n Updated Deliveries:");
		manager.displayDeliveries();
		
		manager.removeDelivery(0);
		
		System.out.println("\n Deliveries after removal");
		manager.displayDeliveries();
		
	}

}
