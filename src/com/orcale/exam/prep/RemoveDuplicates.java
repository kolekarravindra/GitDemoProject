package com.orcale.exam.prep;

import java.util.LinkedHashSet;
import java.util.Set;

//using remove duplicate array using set interface
public class RemoveDuplicates {

	public static void removeDuplicates(int[] arr)
    {
        Set<Integer> set = new LinkedHashSet<Integer>();
 
        // adding elements to LinkedHashSet
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);
 
        // Print the elements of LinkedHashSet
        System.out.print(set);
    }
 
    
    public static void main(String[] args)
    {
    	// input data
        int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
       
        // Function call
        removeDuplicates(arr);
    }
	
}
