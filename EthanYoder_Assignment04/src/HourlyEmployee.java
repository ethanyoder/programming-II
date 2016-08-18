//Ethan Yoder
//April 4, 2016
/* Purpose: This class inherits the Employee class and specializes it for employees
 * that are paid by the hour.
 */

public class HourlyEmployee extends Employee {

	//declares attributes
	private double hours;
	private double rate;
	
	//creates overloaded constructor method
	public HourlyEmployee(String firstName, String lastName, Department department, Rank rank, double hours, double rate) {
		super(firstName, lastName, department, rank);
		this.hours = hours;
		this.rate = rate;
	}
	
	//overrides toString method to show attributes
	@Override
	public String toString() {
		return "First Name: " + firstName + ", Last Name: " + lastName + ", Department: " + department + ", Rank: " + rank + ", Hours: " + hours + ", Rate: " + rate;
	}
	
	//overrides getPay method to return pay weekly pay for hourly employees
	@Override
	public double getPay() {
		return hours * rate;
	}
}
