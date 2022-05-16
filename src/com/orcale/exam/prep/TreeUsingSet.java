package com.orcale.exam.prep;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

// Using different solutions set interface.
public class TreeUsingSet {
	
	 public static void main(String args[]){  
	
	  Set<String> al =new TreeSet<String>();  
	  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");
	  al.add("Anil");
	  al.add("Ajay");  
	  al.add("Anil");  

	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println("output of program: "+itr.next());  
	  }  
	  
		 /*List<String> cities = Arrays.asList("Milan","london","San Francisco","Tokyo","New Delhi"
			);
			System.out.println(cities);
			cities.sort(String.CASE_INSENSITIVE_ORDER);
			System.out.println(cities);
	   
	 */
	 }
}
