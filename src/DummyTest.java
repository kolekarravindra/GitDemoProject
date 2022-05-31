import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


abstract class Super {
    public abstract void m1() throws IOException;
}

class Sub extends Super {
    @Override
    public void m1() throws IOException {
        throw new FileNotFoundException();
    }
}

public class DummyTest {
	 public static void main(String[] args) throws IOException  {
	       /* String[] names = { "Smith", "Brown", "Thomas", "Taylor", "Jones" };
	        List<String> list = new ArrayList<>();
	        for (int x = 0; x < names.length; x++) {
	            list.add(names[x]);
	            switch (x) {
	                case 2:
	                    continue;
	            }
	        }
	        System.out.println(list.size());
	        System.out.println(list);*/
		 
	    
		
	/* LocalTime time = LocalTime.of(16, 40);
     String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ?  "PM" : "AM" ;
     System.out.println(amPm);*/
	 
		/* List<Student> students = new ArrayList<>();
	     students.add(new Student("sangram", 25));
	     students.add(new Student("James", 27));
	     students.add(new Student("test", 25));
	     students.add(new Student("James", 25));

	     students.remove(new Student("sangram", 25));

	     for(Student stud : students) {
	         System.out.println(stud);
		 
	     }
	 }*/

	 
		 
	   /*      Student student = new Student("James", 25);
	         int marks = 25;
	         review(student, marks);
	         System.out.println(marks + "-" + student.marks);
	     }
	 
	     private static void review(Student stud, int marks) {
	         marks = marks + 10;
	         stud.marks+=marks;
	     
		 */
		 
		/* Super s = new Sub();
         try {
             s.m1();
         } catch (FileNotFoundException e) {
             System.out.print("M");
         } finally {
             System.out.print("N");
         }*/
		 
		 int[] x = {120, 200, 016 };
		 for(int i = 0; i < x.length; i++)
		 System.out.print(x[i] + " ");
     
	 }
} 
	 

