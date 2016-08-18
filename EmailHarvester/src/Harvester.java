import java.util.Arrays;
import java.io.*;
import java.util.*;

//Ethan Yoder
//January 12, 2016
//Searches for email addresses from a file to store in an array

public class Harvester {
	
	//declares variables
	private String fileName;
	private String[] emailList;
	
	/**Default
	 * @param fileName
	 * @param emailList
	 */
	public Harvester() {
		fileName = "";
		emailList = new String[10];
	}
	
	/**Overloaded
	 * 
	 */
	public Harvester(String fileName) throws IOException {
		emailList = new String[10];
		setFileName(fileName);
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) throws IOException {
		this.fileName = fileName;
		File file = new File(fileName);
		if (!file.exists())
			System.out.println("File does not exist");
		else{
			Scanner sc = new Scanner(file);
			int emailCount = 0;
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				if(line.contains("@")){
					int atPosition = line.indexOf("@");
					int endPosition = line.indexOf(" ", atPosition);
					if (endPosition == -1)
						endPosition = line.length();
					int startPosition = line.lastIndexOf(" ", atPosition);
					String email = line.substring(startPosition + 1, endPosition);
					emailList[emailCount] = email;
					emailCount++;
				}
			}
			sc.close();
		}
	}
	
	/**
	 * @return the emailList
	 */
	public String[] getEmailList() {
		return emailList;
	}

	public int getNumOfEmails(){
		int countOfemail = 0;
		for (int i = 0; i < emailList.length; i++)
			if(emailList[i] != null)
				countOfemail++;
		return countOfemail;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Harvester [emailList=" + Arrays.toString(emailList) + "]";
	}
	
	
}
