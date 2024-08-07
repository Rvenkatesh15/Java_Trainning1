package com.org.staticpoly;

class Staticpoly{
	int n1;
	int n2;
	double n3;
	double n4;
	
	Staticpoly(int n1,int n2,double n3,double n4){
		this.n1=n1;
		this.n2=n2;
		this.n3=n3;
		this.n4=n4;
		
	}
	public static int add(int a,int b) {
		return a+b;
	}
	public static double add(int a,double b) {
		return a+b;
	}

}
public class StaticPolym{
	public static void main(String[] args) {
		System.out.println(Staticpoly.add(3, 5));
		System.out.println(Staticpoly.add(3, 5.25));
		
	}
}

