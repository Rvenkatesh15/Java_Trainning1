package com.org.day4;
// custom Exception
class PaymentException extends Exception{
	public PaymentException(String message) {
		super(message);
	}
}

class PaymentService{
	public void processPayment(double amount) throws PaymentException{
		if(amount<=0) {
			// Throe a payement Exception for invalid payement amount
			throw new PaymentException("Invalid payment amount: "+amount);
		}
	}
}

public class EcommerceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentService ps=new PaymentService();
		try {
			ps.processPayment(-100);
		}catch(PaymentException e) {
			System.out.println("payment failed: "+e.getMessage());
			
		}

	}

}
