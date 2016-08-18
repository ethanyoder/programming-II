//Ethan Yoder
//January 26, 2016
//Purpose: To test the Student class

public class TestStudents {

	public static void main(String[] args) {
		
		Student studentOne = new Student("Bob", "Williamsport", 60, "BSI", 2014);
		Student studentTwo = new Student("Ann", "Milton", 30, "BGS", 2015);
		Student studentThree = new Student("Bob", "Williamsport", 60, "BSI", 2014);
		Student studentFour = new Student("Melissa", "Philadelphia", "BSI", 2016);
		
		System.out.println(studentOne);
		System.out.println(studentTwo);
		System.out.println(studentThree);
		System.out.println(studentFour);
		
		if (studentOne.equals(studentThree))
			System.out.println("They match!");
		else
			System.out.println("They do not match!");


	}

}
