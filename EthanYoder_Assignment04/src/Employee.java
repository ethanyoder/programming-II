//Ethan Yoder
//April 4, 2016
/* Purpose: This class holds general information and methods about employees.  Being an abstract
 * class, it is meant to be inherited by more specific employee subclasses.
 */

public abstract class Employee implements Comparable<Employee> {

	//declares attributes
	protected String firstName;
	protected String lastName;
	protected Department department;
	protected Rank rank;
	
	//creates overloaded constructor method
	public Employee(String firstName, String lastName, Department department, Rank rank) {
		this.firstName = firstName;
		this.lastName = lastName;
		if (department != Department.Accounting && department != Department.HR && department != Department.Marketing && department != Department.Sales)
			throw new InvalidDepartmentException();
		else
			this.department = department;
		if (rank != Rank.Junior && rank != Rank.Senior && rank != Rank.Manager)
			throw new InvalidRankException();
		else
			this.rank = rank;
	}
	
	//overrides toString method to display all information about all attributes in the class
	@Override
	public String toString() {
		return "First Name: " + firstName + ", Last Name: " + lastName + ", Department: " + department + ", Rank: " + rank;
	}
	
	//this method overrides the method from the Comparable interface
	public int compareTo(Employee obj) {
		if (department.ordinal() == obj.department.ordinal())
		{
			if (rank.ordinal() == obj.rank.ordinal())
				return 0;
			else if (rank.ordinal() < obj.rank.ordinal())
				return -1;
			else
				return 1;
		}
		else if (department.ordinal() < obj.department.ordinal())
			return -1;
		else
			return 1;
	}
	
	//this abstract method establishes the header for getting the value of employee pay
	public abstract double getPay();
	
	
	
}
