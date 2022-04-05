import java.util.Scanner;

public class OracleExamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
	/*	// exercise 1
		int ditance;   // define variable
		ditance=4750;
		int km,m;
		km=ditance/1000;
		//km=ditance/;
		m=ditance%1000;
		System.out.println("output of ditance "+km);
		System.out.println("output of km "+m);
     */
	
		
		
		
/*		// exercise 2
		// TypeCasting example
		//long time = 4000000000L;
		long time = 4000000000L;
		long devide = 1000000000L;
		int second;
		second=(int) (time/devide);
	 System.out.println("out put of second "+second);

	
	*/
		
	/*	// exercise 3
		//float example
		//float f=10.45/9.5;              // Exception error
		float f=10.45f/9.5f; 
		System.out.println(f);
	*/
		
		
	/*	// exercise 4
		// operator procedure
		long data=(3*5)%7;
		long data1=3*5%7;
		long data2=(3+5)%7;
        long data3=6+5*9+5;
		System.out.println(data2);
		System.out.println(data3);
		
      */
	
	/*	// exercise 5
		// Boolean  logical Operators
		boolean isBlond=false;
		//boolean isGraduated=false;
		boolean isGraduated=false;

		boolean isfemale=false;
		
		boolean result=(isfemale && isGraduated && !isBlond)
				||
				(!isfemale && isGraduated && isBlond);
		
		System.out.println(result);
		
		*/
			
           
	
	
	// exercise 6
	
	/*float f=(float) (20.5*24.5);
	
	System.out.println(f);
	
*/
		
		// exercise 7
		
		/*char c=65+32;
        System.out.println(c);
	*/
		
		// exercise 8
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the grade");
		int grade=sc.nextInt();
		if(grade > 80 && grade < 100 ) {
			System.out.println("first class--->A");
			System.out.println("Thanks for the attending exam");
			
		}else if(grade >50 && grade < 80 ) {
			if(grade > 60) {
			System.out.println("first class--->B");
			System.out.println("Thanks");
			}else 
			System.out.println("you are failed,please reagian the exam");
			
		
		}
	    else if(grade > 0  && grade > 30){
	 	
		   System.out.println("second class---->C");
	   }
     
        else
     {
    	 System.out.println("excetion time");
      }
     }

}
