package com.org.day5;
import java.util.*;

public class Player {
	String name;
	int id;
	String skill;
	String country;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public Player(String name, int id, String skill, String country) {
		super();
		this.name = name;
		this.id = id;
		this.skill = skill;
		this.country = country;
	}
	


	@Override
	public String toString() {
		return "Player [name=" + name + ", id=" + id + ", skill=" + skill + ", country=" + country + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No.Of players to be added: ");
		int n=sc.nextInt();
		sc.nextLine();
		Player[] arr=new Player[n];
		for(int i=0;i<n;i++) {
			String name=sc.nextLine();
			int id=sc.nextInt();
			sc.nextLine();
			String skill=sc.nextLine();
			String country=sc.nextLine();
			
			
			arr[i]=new Player(name,id,skill,country);
		}
//		Player p=new Player("venky",101,"AllRounder","India");
		System.out.println(Arrays.toString(arr));
		

	}

}
