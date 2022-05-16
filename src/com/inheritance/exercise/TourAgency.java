package com.inheritance.exercise;

public class TourAgency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Customers customer = new Customers(1, "Ravindra", "kolekar", "M", true);
     Customers customer2 = new Customers(2, "deshraj", "tiwari", "M", true);
     Customers customer3 = new Customers(3, "Vaibhav", "patil", "M", true);
     Customers customer4 = new Customers(4, "Deepa", "Surekha", "F", true);
   

	    System.out.println("--------------------Car------------------");

		Car car=new Car();
		car.reserveSeat(customer); 
		car.reserveSeat(customer2); 
		car.reserveSeat(customer3); 
		car.reserveSeat(customer4); 
		//car.reserveSeat(customer5); 

		car.listSeats();
		
		System.out.println("-------------------Bus----------------------");
		Bus bus=new Bus();
		bus.reserveSeat(customer); 
		bus.reserveSeat(customer2); 
		bus.reserveSeat(customer3); 
		bus.reserveSeat(customer4); 
		//bus.reserveSeat(customer5); 
        bus.listSeats();
        
		System.out.println("-------------------Planes----------------------");

		Plane plane=new Plane();
		plane.reserveSeat(customer); 
		plane.reserveSeat(customer2); 
		plane.reserveSeat(customer3); 
		//car.reserveSeat(customer4); 
		//car.reserveSeat(customer5); 
		plane.listSeats();
	}
}
