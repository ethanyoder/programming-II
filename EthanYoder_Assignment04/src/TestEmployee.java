//Ethan Yoder
//April 4, 2016
/* This is a test class that will test the Employee class's subclasses
 * by creating objects of those classes.  Those objects will then be sorted by
 * department and then their various information will be printed out.
 */

import java.util.*;

public class TestEmployee {

	public static void main(String[] args) {
		
		//creates ArrayList to hold objects that inherit the Employee class type
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		//populates ArrayList with HourlyEmployee and SalaryEmployee objects
		list.add(new HourlyEmployee("Mo", "Williams", Department.HR, Rank.Junior, 35, 13.75));
		list.add(new HourlyEmployee("Brian", "Scalabrine", Department.Accounting, Rank.Junior, 40, 12.50));
		list.add(new HourlyEmployee("Sam", "Bowie", Department.Marketing, Rank.Senior, 30, 15.00));
		list.add(new HourlyEmployee("Carlos", "Arroyo", Department.Sales, Rank.Manager, 25, 12.50));
		list.add(new SalaryEmployee("Lebron", "James", Department.Sales, Rank.Manager, 1225));
		list.add(new SalaryEmployee("Greg", "Popvich", Department.HR, Rank.Senior, 1200));
		list.add(new SalaryEmployee("Steph", "Curry", Department.Accounting, Rank.Junior, 875));
		list.add(new SalaryEmployee("Jabari", "Parker", Department.Marketing, Rank.Junior, 800));
		
		//sorts the ArrayList by department and then by rank
		Collections.sort(list);
		
		//prints out the content of the ArrayList
		System.out.println("You have the following employees (last column is weekly pay):");
		for (Employee e : list)
			System.out.println(e.toString() + ", Weekly Pay: " + e.getPay());
		
	}

}
