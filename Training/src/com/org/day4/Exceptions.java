package com.org.day4;

class Excep{
	String name;
	int age;
	int marks;
	String pNumber;
	public Excep(String name, int age, int marks, String pNumber) {
		super();
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.pNumber = pNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getpNumber() {
		return pNumber;
	}
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}
	void show(int a,int b) {
		try {
			System.out.println(a/b);
			
		}catch (Exception e){
			System.out.println(e);
			
		}
		
		
	}
}

public class Exceptions {
	public static void main(String[] args) {
		Excep e=new Excep("venky",22,75,"123456789");
		e.show(25,0);
		
	
	}

}
