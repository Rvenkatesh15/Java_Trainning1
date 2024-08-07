package com.org.day4;

class TeamLead{
	String PID;
	String name;
	String empId;
	public TeamLead(String pID, String name, String empId) {
		super();
		PID = pID;
		this.name = name;
		this.empId = empId;
	}
	public String getPID() {
		return PID;
	}
	public void setPID(String pID) {
		PID = pID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	void display() {
		System.out.println("Team is Working");
	}

	
}
class Team extends TeamLead{
	String Tname;
	String pName;
	int noOfDevelopers;
	public Team(String pID, String name, String empId, String tname, String pName, int noOfDevelopers) {
		super(pID, name, empId);
		Tname = tname;
		this.pName = pName;
		this.noOfDevelopers = noOfDevelopers;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getNoOfDevelopers() {
		return noOfDevelopers;
	}
	public void setNoOfDevelopers(int noOfDevelopers) {
		this.noOfDevelopers = noOfDevelopers;
	}
	
	void display() {
		System.out.println(Tname+" "+pName+" "+noOfDevelopers+" "+PID);
	}
	
	
	
}

public class SingleLevelInheritance {
	public static void main(String[] args) {
		Team t=new Team("101","Rohan","1234567","VenkyTeam","citi bank",4);
		t.display();
		
	}

}
