package com.org.day4;


class CitiBank{
	double minBal=1000;
	
	
	public CitiBank(double minBal) {
		super();
		this.minBal = minBal;
	}


	void display() {
		System.out.println("Your min balance is"+minBal);
		
	}
}
class SBI extends CitiBank{
	double i=2.75;
	
	
	public SBI(double minBal, double i) {
		super(minBal);
		this.i = i;
	}


	void display() {
		System.out.println("Your Bal in SBI is "+minBal*i);
	}
}
class HDFC extends CitiBank{
	public HDFC(double minBal) {
		super(minBal);
		
	}
	double i=3.75;



	void display() {
		System.out.println("Your Bal in HDFC is "+minBal*i);
	}
}

public class HierachalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC h=new HDFC(1000);
		h.display();
		SBI s=new SBI(1000,3);
		s.display();

	}

}
