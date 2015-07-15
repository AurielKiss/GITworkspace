package Interface;

import java.util.*;

/**
 * This program demonstrates the use of the Comparable interface.
 * @version 1.30 2004-02-27
 * @author Cay Horstmann
 */
public class EmployeeSortTest
{
   public static void main(String[] args)
   {
      Emplyee[] staff = new Emplyee[3];

      staff[0] = new Emplyee("Harry Hacker", 35000);
      staff[1] = new Emplyee("Carl Cracker", 75000);
      staff[2] = new Emplyee("Tony Tester", 38000);

      Arrays.sort(staff);

      // print out information about all Employee objects
      for (Emplyee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
   }
}