import java.io.IOException;
import java.util.Arrays;

public class HarvesterTest {

	public static void main(String[] args) throws IOException {
		
		//declares variables
		String fileOne = "easy.txt";
		String fileTwo = "mid.html";
		String fileThree = "challenge.html";
		
		//testing constructors
		Harvester obj1 = new Harvester(fileOne);
		Harvester obj2 = new Harvester(fileTwo);
		Harvester obj3 = new Harvester(fileThree);
		
		//tests file name setter
		if (!(obj2.getFileName().equals(fileTwo)))
			System.err.println("Problem with the file name setter");
		
		//tests number of elements getter
		if (obj1.getNumOfEmails() != 3)
			System.err.println("Problem with number of elements getter for easy.txt");
		if (obj2.getNumOfEmails() != 1)
			System.err.println("Problem with number of elements getter for challenge.html");
		if (obj3.getNumOfEmails() != 3)
			System.err.println("Problem with number of elements getter for challenge.html");
		
		//tests the email list getter
		String[] fileOneList = new String[10];
		fileOneList[0] = "tellnoone@yahoo.com";
		fileOneList[1] = "didyoutellnoone@gmail.com";
		fileOneList[2] = "yesthereis@pct.edu";
		if (!Arrays.equals(obj1.getEmailList(), fileOneList))
			System.err.println("Error getting email list for obj1");
		String[] fileTwoList = new String[10];
		fileTwoList[0] = "amcnett@pct.edu";
		if (!Arrays.equals(obj2.getEmailList(), fileTwoList))
			System.err.println("Error getting email list for obj2");
		String[] fileThreeList = new String[10];
		fileThreeList[0] = "ST-VOTERREG@pa.gov";
		fileThreeList[1] = "ST-HAVA@pa.gov";
		fileThreeList[2] = "ST-HAVA@pa.gov";
		if (!Arrays.equals(obj3.getEmailList(), fileThreeList))
			System.err.println("Error getting email list for obj3");
		
		//tests the toString method
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		System.out.println(obj3.toString());
		
		System.out.println("Test of Harvester Class Complete");
			

	}

}
