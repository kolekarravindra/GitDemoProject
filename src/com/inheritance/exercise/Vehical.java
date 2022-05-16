package com.inheritance.exercise;

import java.util.Iterator;

public class Vehical {

	private String manufacturer;
	protected String plate;
	protected String destination;
	
	
	protected Customers seats[][]= new Customers[0][0];
	
	
	protected void listSeats() {
		int i,j=0;
		for ( i=0; i< seats.length; i++) {
			for( j=0; j< seats[i].length; j++) {
				
				if(seats[i][j]==null) {
					int seat= i * seats[0].length + j +1;
					System.out.println("Seat:" +seat+" " +"Availbale Seat");
				}else {
					int seat= i * seats[0].length + j +1;
                    System.out.println("Seat:" +seat+" "+seats[i][j].getName()+ " " +seats[i][j].getSurnmae());
				}
			}
			
		}
		
	}
	
	
	protected String reserveSeat(Customers c) {
		int i,j=0;
		Boolean isfound=false;
		for ( i=0; i< seats.length; i++) {
			if(isfound)
				break;
			for( j=0; j< seats[i].length; j++) {
				
				if(seats[i][j]==null) {
					if(j==1)
						if(seats[i][0]==null || ! seats[i][0].getGeneder().equals(c.getGeneder()))
					    continue;
					seats[i][j]=c;
					isfound=true;
					break;
				}
			}
			
		}
		int seat= (i-1) * seats[0].length + j +1;
		
		return seat +" ";
		
	}
	
	public String getMenufacturer() {
		return manufacturer;
		
	}
	
	public void setManuFacturer(String manufacturer) {
		
		this.manufacturer=manufacturer;
	}
	
}
