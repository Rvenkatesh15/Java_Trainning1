package com.org.day5;

//Custom exception for product inventory-related errors (extends RuntimeException)
class InsufficientInventoryException extends RuntimeException {
 public InsufficientInventoryException(String message) {
     super(message);
 }
}

//Service class that manages product inventory
class InventoryService {
 private int availableQuantity = 100; // Initial available quantity

 public void processOrder(int quantity) {
     if (quantity > availableQuantity) {
         // Throw a custom InsufficientInventoryException if the requested quantity exceeds available quantity
         throw new InsufficientInventoryException("Insufficient inventory. Available quantity: " + availableQuantity);
     }else {
    	 System.out.println("success");
     }
   
 }
}

//Main class demonstrating the usage of custom runtime exception in e-commerce context
public class EcommerceApp {
 public static void main(String[] args) {
     InventoryService inventoryService = new InventoryService();

     try {
         
         inventoryService.processOrder(150); // This should throw an InsufficientInventoryException
     } catch (InsufficientInventoryException e) {
         // Handle the InsufficientInventoryException
         System.out.println("Order processing failed: " + e.getMessage());
         
     }
 }
}
