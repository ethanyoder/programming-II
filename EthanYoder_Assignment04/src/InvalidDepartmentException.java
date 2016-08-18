//Ethan Yoder
//April 7, 2016
//Purpose: This exception class is used for when an Employee object is created with an invalid department

public class InvalidDepartmentException extends RuntimeException{

	//creates no-arg constructor method
	public InvalidDepartmentException() {
		super("Invalid Department Exception: Department does not exist");
	}
	
	//creates overloaded constructor method
	public InvalidDepartmentException(String s) {
		super(s);
	}
}
