package com.java.oracle;

import java.util.HashSet;
import java.util.Set;
//exercise collection 
public class DuplicateWordRemover {

	 public String removeDuplicateLetters(String s) {
		 StringBuilder output=new StringBuilder();
		 Set<Character> characterSet= new HashSet<>();
		   for(Character c : s.toCharArray()) {
			   if(characterSet.contains(c)) {
			   }
			   else {
				   characterSet.add(c);
				   output.append(c);
			   }
		   }
		   return output.toString();
	 }
	 public static void main(String[] args) {
         DuplicateWordRemover remover = new DuplicateWordRemover();
       String result = remover.removeDuplicateLetters("Collections is the most important item in Java development");
          System.out.println(result);
}
}
