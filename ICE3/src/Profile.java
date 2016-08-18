//Ethan Yoder
//January 26, 2016
//Purpose: Stores academic information of students

public class Profile {

	//declares attributes
	int numCredits;
	String major;
	int enrollYear;
	
	//overloaded constructor
	public Profile(int numCredits, String major, int enrollYear)
	{
		this.numCredits = numCredits;
		this.major = major;
		this.enrollYear = enrollYear;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Profile [numCredits=" + numCredits + ", major=" + major + ", enrollYear=" + enrollYear + "]";
	}

	/**
	 * @return the numCredits
	 */
	public int getNumCredits() {
		return numCredits;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @return the enrollYear
	 */
	public int getEnrollYear() {
		return enrollYear;
	}
	
	
}
