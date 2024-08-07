package com.org.day6;
import java.util.*;

public class HashTableExample {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(452);
		arr.add(22);
		arr.add(22);
		HashSet<Integer> hs=new HashSet<>(arr);
		hs.add(25);
		System.out.println(hs);
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
