//Ethan Yoder
//January 20, 2016
//Purpose: To face off two combinations of two countries and choose a winner

import java.util.*;

public class YoderAssignment1 {

	//creates Scanner object, Random object and enumeration
	static Scanner console = new Scanner(System.in);
	static Random rand = new Random();
	enum Country { CANADA, BRAZIL, RUSSIA, JAPAN, CHINA, USA }
	
	public static void main(String[] args) {
		
		//declares arrays
		int teams[] = {7,7};
		int teamsComp[] = new int[2];
		Country countries[][] = new Country[2][2];
		
		while (teams[0] != 0 || teams[1] != 0)
		{
			//greets user and displays country choices
			System.out.println("Welcome to Rio de Janeiro! Choose your fantasy Olympics team (2 countries):");
			System.out.println("1. Canada");
			System.out.println("2. Brazil");
			System.out.println("3. Russia");
			System.out.println("4. Japan");
			System.out.println("5. China");
			System.out.println("6. United States");
			
			//prompts user for their two team choices
			do
			{
			System.out.println("Enter number of first team (0 to exit)");
			teams[0] = console.nextInt();
			if (teams[0] == 0)
				System.exit(0);
			System.out.println("Enter number of second team (0 to exit)");
			teams[1] = console.nextInt();
			if (teams[1] == 0)
				System.exit(0);
			} while ((teams[0] < 1 || teams[0] > 6) || (teams[1] < 1 || teams[1] > 6));
			
			//randomly chooses two countries for the computer's team
			teamsComp[0] = rand.nextInt(6);
			teamsComp[1] = rand.nextInt(6);
			
			//uses switch to turn random numbers into enumeration values for the computer's team
			for (int i = 0; i < 2; i++)
				switch (teamsComp[i])
				{
					case 0 :
						countries[1][i] = Country.CANADA;
						break;
					case 1 :
						countries[1][i] = Country.BRAZIL;
						break;
					case 2 :
						countries[1][i] = Country.RUSSIA;
						break;
					case 3 :
						countries[1][i] = Country.JAPAN;
						break;
					case 4 :
						countries[1][i] = Country.CHINA;
						break;
					case 5 :
						countries[1][i] = Country.USA;
						break;
				}
			
			//tells user the team that they will be facing
			System.out.println("You will be facing: " + countries[1][0] + " and " + countries[1][1]);
			
			//uses switch to turn number choices for user into enumeration values and says country's slogans
			for (int i = 0; i < 2; i++)
				switch (teams[i])
				{
					case 1 :
						countries[0][i] = Country.CANADA;
						System.out.println("Canada: Eh, this is the winter Olympics right?");
						break;
					case 2 :
						countries[0][i] = Country.BRAZIL;
						System.out.println("Brazil: Home sweet home!");
						break;
					case 3 :
						countries[0][i] = Country.RUSSIA;
						System.out.println("Russia: Strength in numbers... land area, that is...");
						break;
					case 4 :
						countries[0][i] = Country.JAPAN;
						System.out.println("Japan: When is this party coming to Tokyo?");
						break;
					case 5 :
						countries[0][i] = Country.CHINA;
						System.out.println("China: We already won the high dive!");
						break;
					case 6 :
						countries[0][i] = Country.USA;
						System.out.println("USA: Still ready to come through, Phelps?");
						break;
				}
			
			//compares ordinal values of the teams and tells the user who won based on the sums
			if (countries[0][0].ordinal() + countries[0][1].ordinal() > countries[1][0].ordinal() + countries[1][1].ordinal())
				System.out.println("Gold Medal for your victory!");
			else if (countries[0][0].ordinal() + countries[0][1].ordinal() < countries[1][0].ordinal() + countries[1][1].ordinal())
				System.out.println("You did not win... silver medal at best...");
			else
				System.out.println("Tie! Share the pedestal");
		}
	}

}