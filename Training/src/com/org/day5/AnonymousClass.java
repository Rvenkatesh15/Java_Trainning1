package com.org.day5;

interface MyDemo{
	void call();
}

class Polygon {
	   public void display() {
	      System.out.println("Inside the Polygon class");
	   }
	   MyDemo m=new MyDemo() {
		   public void call() {
			   System.out.println("Interface call method");
		   }
	   };
	}

	class AnonymousDemo {
	   public void createClass() {

	      // creation of anonymous class extending class Polygon
	      Polygon p1 = new Polygon() {
	         public void display() {
	            System.out.println("Inside an anonymous class.");
	         }
	         public void call() {
	        	 System.out.println("calling");
	         }
	      };
	      p1.display();
	      //5p1.call();
	      
	   }
	}

	public class AnonymousClass{
	   public static void main(String[] args) {
	       AnonymousDemo an = new AnonymousDemo();
	       an.createClass();
	   }
	}
