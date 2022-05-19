package com.collection.practies;

public class Student {

	private String name;
    private int regNumber;
    
    public Student(String n, int reg)
    {
            this.name = n;
            this.regNumber = reg;
    }
    public String getName()
    {
            return name;
    }
    public void setName(String name)
    {
            this.name = name;
    }
    public int getReg()
    {
            return regNumber;
    }
    public void setReg(int regNumber)
    {
            this.regNumber = regNumber;
    }
    public String toString()
    {
            return "Student Name: "+this.name+", Reg Number: "+this.regNumber;  
    }
	
}
