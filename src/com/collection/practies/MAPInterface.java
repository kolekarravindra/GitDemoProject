package com.collection.practies;

import java.util.HashMap;
import java.util.Map;

public class MAPInterface {

    public static void main(String args[])
    {
        Map<String, Integer> hm
            = new HashMap<String, Integer>();
  
        
        hm.put("a", new Integer(100));
        hm.put("b", new Integer(200));
        hm.put("c", new Integer(300));
        hm.put("d", new Integer(400));
        hm.put("d", new Integer(500));
  
        for (Map.Entry<String, Integer> me :
             hm.entrySet()) {
  
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
	
	
}
//end point
