package com.collection.practies;

import java.util.HashMap;
import java.util.Map;

public class MAPInterfaceProgram2 {

	 public static void main(String args[])
	    {
	  
	        
	        Map<Integer, String> hm1
	            = new HashMap<Integer, String>();
	  
	        // Inserting the Elements
	        hm1.put(new Integer(1), "Geeks");
	        hm1.put(new Integer(2), "For");
	        hm1.put(new Integer(3), "Geeks");
	        hm1.put(new Integer(4), "For");
	  
	        // Initial Map
	        System.out.println(hm1);
	  
	        hm1.remove(new Integer(4));
	  
	        // Final Map
	        System.out.println(hm1);
	    }
	
}
