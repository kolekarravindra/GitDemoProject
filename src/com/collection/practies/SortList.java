package com.collection.practies;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

 class StudCompare implements Comparator<Student> {

	 public int compare(Student stud1, Student stud2)
{
     if (stud1.getReg() < stud2.getReg())
     {
              return 1;
     }
              return -1;
}
}
class SortList
{
        public static void main(String[] args)
        {
                LinkedList<Student> list = new LinkedList<Student>();
                list.add(new Student("Ravindra", 1001));
                list.add(new Student("Vaibhav", 1005));
                list.add(new Student("Salim", 1000));
                list.add(new Student("Deshraj", 1002));
                
                Collections.sort(list, new StudCompare());
                
                System.out.println("Sorted list based on registration number\n");
                System.out.println("**=============**=================**");
                
                for (Student stud: list )
                {
                        System.out.println(stud);
                }
                System.out.println("**=============**=================**\n");
        }
}
