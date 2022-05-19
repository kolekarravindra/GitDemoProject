
public class Test {
	
	public static void main(String args[]) {
		
	int i = 5;
	int j = 0;
	try{
			// code that may raise exception
			
	System.out.println(i / j); // first check condition if any exception then not check second condition
	System.out.println(i * j); // second condition not check before exception.
	}                          //this condition put in line no 12 in finally block code will be executed properly.
	catch (ArithmeticException e) 
	{
		 System.out.println(e);
	} finally 
	{
	System.out.println("multiplication result = "+i * j); // put condition in finally block code be executed.
	}                          //output will be 0
		
	}

}
