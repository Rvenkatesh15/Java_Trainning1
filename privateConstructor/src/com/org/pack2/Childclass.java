package com.org.pack2;
import java.util.*;

public class Childclass {
	int id;
	int marks;
	String name;
	
	private Childclass(int id,int marks,String name) {
		this.id=id;
		this.marks=marks;
		this.name=name;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Childclass[] arr=new Childclass[3];
		for(int i=0;i<arr.length;i++) {
			int id=sc.nextInt();
			int marks=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			
			arr[i]=new Childclass(id,marks,name);
		}
		Childclass res=show(arr);
		System.out.println(res);
		
		
	}
	public static Childclass show(Childclass[] arr) {
		return arr[0];
		
		
	}
	

}
