package org.day3;
import java.util.*;

class Bank{
	private String bankName;
	private Employee[] empArr;
	
	public Bank(String bankName) {
		this.bankName=bankName;
		
	}
	public Bank() {
		// TODO Auto-generated constructor stub
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Employee[] getEmpArr() {
		return empArr;
	}
	public void setEmpArr(Employee[] empArr) {
		this.empArr = empArr;
	}
	public void getEmpArr(String[] array) {
		// TODO Auto-generated method stub
		
	}
		
}
class Employee{
	private String empName;

	public Employee(String empName) {
		this.empName=empName;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
}

public class AssociationTest {
	 static String array[]= {"venky","pawan","Ram"};
	public static void main(String[] args) {
		Bank bank=new Bank("HDFC");
		Employee emp=new Employee("venky");
		Bank b=new Bank();
		b.getEmpArr(array);
		for(int i=0;i<array.length;i++) {
			System.out.println(b.getEmpArr()+" is Working in "+bank.getBankName()+" bank");
			
		}
		
		
	}

}
