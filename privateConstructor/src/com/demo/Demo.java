package com.demo;

class Utlities{
	int id;
	int marks;
	String name;
	
	 Utlities(int id,int marks,String name){
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	
	public static int add(int x,int y) {
		return x+y;
	}
	public void display() {
		System.out.println("Hello");
	}
}

public class Demo {
	public static void main(String[] args) {
		int result=Utlities.add(2,5);//it is called directly using class name
		System.out.println(result);
		Utlities ut=new Utlities(101,200,"venky");//it is called by using object name
		ut.display();
		
	}
	


}
