package com.org.day6;
import java.util.*; 
import java.util.Map.Entry;
public class HashDemo  
{  
    
    public static void main(String args[])  
    {  
        
        Hashtable<Integer, String> hm = new Hashtable<Integer, String>();  
        
        
        hm.put(3, "You are visiting");  
        hm.put(5, "Hello");  
        hm.put(1, "website");  
        hm.put(2, "Javatpoint"); 
        hm.putIfAbsent(202, "How"); 
    
          
        System.out.println(hm);  
        List<Integer> Enum = new ArrayList<Integer>();                
        Enum.add(1100);  
        Enum.add(2100);  
        Enum.add(5100);  
        
        Enumeration<Integer> en = Collections.enumeration(Enum);  
        System.out.println("The Enumeration List are: ");  
        while(en.hasMoreElements()){  
             System.out.println(en.nextElement());  
        } 
    
	
    Set<Entry<Integer,String>> set=hm.entrySet();
    for(Entry<Integer,String>s: set) {
    	System.out.println(s);
    }
    
}  
}