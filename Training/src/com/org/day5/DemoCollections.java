package com.org.day5;
import java.util.*;


public class DemoCollections{

	public static void main(String[] args) {
		List<String>list=new LinkedList<>();
		list.add("venky");
		List<String> arr=new ArrayList<>();
		arr.add("mango");
		arr.add(0,"ram");
		System.out.println(list);
		System.out.println(arr);
		list.addAll(arr);
		System.out.println(list);
		//list.remove("venky");
		System.out.println(list.contains("venky"));
		if(list.contains("ram")) {
			list.remove("ram");
		}
		System.out.println(list);
		
		
		
	}

}
