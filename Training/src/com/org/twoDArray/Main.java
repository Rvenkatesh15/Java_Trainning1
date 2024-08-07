package com.org.twoDArray;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductManager productManager=new ProductManager(5);
		CartManager cartManager=new CartManager(3,5);
		DeliveryManager deliveryManager=new DeliveryManager();
		
		productManager.addProduct("Laptop", 1000);
		productManager.addProduct("Phone", 500);
		productManager.addProduct("Tablet", 300);
		
		
		boolean exit=false;
		while(!exit) {
			System.out.println("\n1.Display Products\n2.Add to cart\n3. view Cart\"\n4.Purchase\n5.Deliver\n6.Exit");
			int choice=sc.nextInt()	;
			switch(choice) {
			case 1:
				
			}
			
		
		}

	}

}
