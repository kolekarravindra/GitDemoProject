package com.exception;

public class MyGreatTime {

	private int minutes = 0;

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) throws ValueException{
		
		if(80 < minutes)
		{
			//throw new ValueException("try to time set 80 mintues");
			System.err.println("try to time set 80 mintues ");
		}
		else {
			System.out.println("Proper Successful set value");
		}
		
		this.minutes = minutes;
	}
	
	
	
	
}
