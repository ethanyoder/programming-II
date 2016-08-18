//Ethan Yoder
//January 26, 2016
//Purpose: Store personal and academic student information

public class Student {

	//declares attributes
	private String name;
	private String cityRes;
	private Profile profile;
	
	//overloaded constructor
	public Student(String name, String cityRes, int numCredits, String major, int enrollYear)
	{
		this.name = name;
		this.cityRes = cityRes;
		profile = new Profile(numCredits, major, enrollYear);
	}
	
	//overloaded constructor
	public Student(String name, String cityRes, String major, int enrollYear)
	{
		this(name, cityRes, 0, major, enrollYear);
	}
	
	public boolean equals(Student other)
	{
		if (name.equals(other.name) && cityRes.equals(other.cityRes)
				&& profile.getNumCredits() == other.profile.getNumCredits()
				&& profile.getMajor().equals(other.profile.getMajor())
				&& profile.getEnrollYear() == other.profile.getEnrollYear())
			return true;
		else
			return false;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [name=" + name + ", cityRes=" + cityRes + ", profile=" + profile + "]";
	}
	
	
}
