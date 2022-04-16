package com.orcale.exam.prep;

// exercise method
class BodyMassIndexCalclulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human myHumanInstance = new Human();
		//Human woman=new Human();
		//myHumanInstance.height=80;
		//myHumanInstance.meter=1.5;
	
		double result=myHumanInstance.calclulateBodyMassIndex(80, 1.85);
		System.out.println(result);
		//System.out.println(");
		System.out.println("point of data");
		System.out.println("Rest of data"+result);
		
		
		
	}

}
