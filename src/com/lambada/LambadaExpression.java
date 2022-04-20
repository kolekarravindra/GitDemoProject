package com.lambada;

import java.util.function.Function;

public class LambadaExpression {

	public static void main(String[] args) {
		
		Function<String,Integer> count = 
				
				p -> p.split(" ").length;
			
				Integer countdetails = count.apply("I am Ravindra");
				System.out.println(countdetails);
		}
}
