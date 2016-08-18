//Ethan Yoder
//April 4, 2016
/* This class inherits the Employee class and specializes it for employees who
 * are paid salary.
 */

public class SalaryEmployee extends Employee {

	//declares attributes
	private double weekSal;
	
	//creates overloaded constructor method
	public SalaryEmployee(String firstName, String lastName, Department department, Rank rank, double weekSal) {
		super(firstName, lastName, department, rank);
		this.weekSal = weekSal;
	}
	
	//overrides toString method 
	@Override
	public String toString() {
		return "First Name: " + firstName + ", Last Name: " + lastName + ", Department: " + department + ", Rank: " + rank + ", Weekly Salary: " + weekSal;
	}
	
	//overrides getPay method
	@Override
	public double getPay() {
		return weekSal;
	}
}
