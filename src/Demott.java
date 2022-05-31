import java.util.Scanner;

public class Demott {
	
	 public int m1(int a) { // a=10
		
		a=5;                // a variable value not change
		
		System.out.println("method value "+ a);
		
		return a;           // outside method not change in value
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demott td = new Demott();
		
		int a=10;
		
		td.m1(a); // a = 10 value pass in m1 method
		
		System.out.println("final out ="+a);//out put will be 10
		
		
	}

}
