package com.org.day5;
interface MyName{
	public void SayMyName();
}

public class LambdaExpressionExample {

	public static void main(String[] args) {
		
		// Without lambda ,MyName Implementation
		// Anonymus inner Class
	
		MyName person=new MyName() {
			public void SayMyName() {
				System.out.println("Venky");
			}
		};
		person.SayMyName();
		// TODO Auto-generated method stub

	}

}
