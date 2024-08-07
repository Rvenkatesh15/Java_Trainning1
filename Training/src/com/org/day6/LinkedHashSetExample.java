package com.org.day6;
import java.util.*;
class Student{
	String name;
	int id;
	String city;
	public Student(String name, int id,String city) {
		super();
		this.name = name;
		this.id = id;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
}
public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<Student> h1=new LinkedHashSet<>();
		h1.add(new Student("customer",12,"AP"));
		Iterator<Student> it=h1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		List<Student> arr=new ArrayList<>();
		h1.add(new Student("customer",12,"AP"));

		System.out.println(h1);
		
		List<String> arr1=new LinkedList<>();
		arr1.add("venky");
		arr1.add("venky");
		
		
		
	}

}
