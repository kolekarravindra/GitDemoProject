package com.orcale.exam.prep;
// extra excise 
//exercise 12
//abstarct class  using method
abstract class Bike{  
	  abstract void run();  
	}  
	class Honda4 extends Bike{  
	void run(){
		System.out.println("running");
	
	}  
	
	
	public static void main(String args[]){  
	 Bike obj = new Honda4();  
	 obj.run();  
	}  
	}  
	
