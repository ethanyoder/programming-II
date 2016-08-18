//Ethan Yoder
//April 7, 2016
//Purpose: This exception class is used for when an Employee object is created with an invalid rank

public class InvalidRankException extends RuntimeException {

	//creates no-arg constructor method
	public InvalidRankException() {
		super("Invalid Rank Exception: Rank does not exist");
	}
	
	//creates overloaded constructor method
	public InvalidRankException(String s) {
		super(s);
	}
}
