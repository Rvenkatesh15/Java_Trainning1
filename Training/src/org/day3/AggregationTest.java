package org.day3;

class Employee{
	String name;
	String id;
	String dept;
	public Employee(String name, String id, String dept) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
class Dept{
	String dname;
	String emps;
	public Dept(String dname, String oName) {
		super();
		this.dname = dname;
		this.oName = oName;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getoName() {
		return oName;
	}
	public void setoName(String oName) {
		this.oName = oName;
	}
	
	
}
class Organisation{
	String officeName;
	String dept;
	public Organisation(String officeName, String dept) {
		super();
		this.officeName = officeName;
		this.dept = dept;
	}
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
public class AggregationTest {
	public static void main(String[] args) {
		Employee e=new Employee("venky","101","Mech");
		Dept d=new Dept("")
	}

}
