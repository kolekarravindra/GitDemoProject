package com.orcale.exam.prep;

public class Human {

	double height;
	double meter;
	
	public double calclulateBodyMassIndex(double height1,double weight) {
		
		double result=height1 / (height1*height1);
		
		return result;
	}
}
