package com.functions;

import java.util.function.Function;
// ex funcational interface
public class FunctionsClass {

	public static void main(String[] args) {
		
	
	Function<String,Integer> words = new Function<String,Integer>() {

		@Override
		public Integer apply(String t) {
			// TODO Auto-generated method stub
			return t.split(" ").length;
		}
		
	};
	
	Integer wordcount= words.apply("i am ravi");
	System.out.println(wordcount);
	
}
}
