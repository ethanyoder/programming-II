//Ethan Yoder
//February 11, 2016
/*Purpose: This class organizes the orders of users into objects.  The objects are then put
	together to make a receipt for the user.
*/

//creates package to hold the class in
package cdStore;

public class YoderCD {

	//declares attributes
	private String artist;
	private String album;
	private String condition;
	private String casing;
	private String deluxe;
	private double price;
	
	//default constructor method for YoderCD.  This sends the values to the overloaded constructor
	public YoderCD()
	{
		this("Switchfoot", "Fading West", "New", "Hard Case", "Original Edition");
	}
	
	//Constructor method for YoderCD
	public YoderCD(String artist, String album, String condition, String casing, String deluxe)
	{
		this.artist = artist;
		this.album = album;
		this.condition = condition;
		this.casing = casing;
		this.deluxe = deluxe;
		setPrice();
	}
	
	//this method returns the attributes of the YoderCD objects in a more readable format
	public String toString()
	{
		String deluxe = "";
		if (this.deluxe == "Deluxe Edition")
			deluxe = " (Deluxe Edition)";
		return album + " by " + artist + deluxe + ", " + condition + ", " + casing + " - $" + price;
	}
	
	//this method compares two YoderCD objects to see if their attributes are equal
	public boolean equals(YoderCD obj)
	{
		if (this.toString().equals(obj))
			return true;
		return false;
	}
	
	//This method looks at the details of the CD purchased to match it with the price
	public void setPrice()
	{
		switch (artist)
		{
		case "Switchfoot" :
			switch (album)
			{
			case "Fading West" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 15.99;
						else
							price = 10.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 14.99;
						else
							price = 9.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 9.99;
						else
							price = 7.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 9.99;
						else
							price = 7.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 6.99;
						else
							price = 5.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 4.99;
						break;
					}
				break;
			case "Hello Hurricane" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 11.99;
						else
							price = 8.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 6.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 7.99;
						else
							price = 5.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 6.99;
						else
							price = 4.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 2.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 3.99;
						else
							price = 1.99;
						break;
					}
				break;
			case "Oh! Gravity" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 7.99;
						else
							price = 6.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 6.99;
						else
							price = 4.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 2.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 4.99;
						else
							price = 3.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 3.99;
						else
							price = 2.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 1.99;
						else
							price = 0.99;
						break;
					}
				break;
			case "The Beautiful Letdown" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 9.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 7.99;
						else
							price = 6.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 6.99;
						else
							price = 5.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 4.99;
						else
							price = 3.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 3.99;
						else
							price = 1.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 1.99;
						else
							price = 0.99;
						break;
					}
				break;
				
			}
			break;
		case "Tenth Avenue North" :
			switch (album)
			{
			case "Cathedrals" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 9.99;
						else
							price = 7.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 9.99;
						else
							price = 7.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 8.99;
						else
							price = 6.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 7.99;
						else
							price = 5.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 7.99;
						else
							price = 5.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 3.99;
						break;
					}
				break;
			case "The Struggle" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 11.99;
						else
							price = 10.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 9.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 7.99;
						else
							price = 5.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 8.99;
						else
							price = 7.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 6.99;
						else
							price = 5.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 4.99;
						else
							price = 2.99;
						break;
					}
				break;
			case "The Light Meets the Dark" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 6.99;
						else
							price = 5.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 4.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 3.99;
						else
							price = 1.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 3.99;
						else
							price = 2.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 2.99;
						else
							price = 1.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 1.99;
						else
							price = 0.99;
						break;
					}
				break;
			case "Over and Underneath" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 13.99;
						else
							price = 12.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 12.99;
						else
							price = 11.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 11.99;
						else
							price = 9.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 9.99;
						else
							price = 8.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 7.99;
						else
							price = 6.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 3.99;
						break;
					}
				break;
				
			}
			break;
		case "Toby Mac" :
			switch (album)
			{
			case "Eye on It" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 8.99;
						else
							price = 7.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 7.99;
						else
							price = 5.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 4.99;
						else
							price = 3.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 4.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 4.99;
						else
							price = 2.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 3.99;
						else
							price = 1.99;
						break;
					}
				break;
			case "Tonight" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 11.99;
						else
							price = 10.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 9.99;
						else
							price = 8.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 8.99;
						else
							price = 7.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 8.99;
						else
							price = 6.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 4.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 3.99;
						else
							price = 1.99;
						break;
					}
				break;
			case "Portable Sounds" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 11.99;
						else
							price = 9.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 8.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 6.99;
						else
							price = 5.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 8.99;
						else
							price = 6.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 4.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 3.99;
						else
							price = 2.99;
						break;
					}
				break;
			case "Momentum" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 9.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 9.99;
						else
							price = 8.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 6.99;
						else
							price = 5.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 6.99;
						else
							price = 4.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 3.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 2.99;
						else
							price = 1.99;
						break;
					}
				break;
				
			}
			break;
		case "dc Talk" :
			switch (album)
			{
			case "Supernatural" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 14.99;
						else
							price = 12.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 14.99;
						else
							price = 12.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 9.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 9.99;
						else
							price = 8.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 9.99;
						else
							price = 8.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 3.99;
						break;
					}
				break;
			case "Jesus Freak" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 21.99;
						else
							price = 19.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 20.99;
						else
							price = 17.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 15.99;
						else
							price = 12.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 15.99;
						else
							price = 14.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 13.99;
						else
							price = 11.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 8.99;
						break;
					}
				break;
			case "Free at Last" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 14.99;
						else
							price = 13.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 14.99;
						else
							price = 13.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 8.99;
						else
							price = 5.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 11.99;
						else
							price = 10.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 11.99;
						else
							price = 10.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 6.99;
						else
							price = 3.99;
						break;
					}
				break;
			case "Nu Thang" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 16.99;
						else
							price = 15.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 14.99;
						else
							price = 12.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 11.99;
						else
							price = 10.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 13.99;
						else
							price = 12.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 8.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 5.99;
						else
							price = 3.99;
						break;
					}
				break;
				
			}
			break;
		case "Kanye West" :
			switch (album)
			{
			case "My Beautiful Dark Twisted Family" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 25.99;
						else
							price = 23.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 24.99;
						else
							price = 22.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 18.99;
						else
							price = 16.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 15.99;
						else
							price = 13.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 12.99;
						else
							price = 10.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 9.99;
						else
							price = 7.99;
						break;
					}
				break;
			case "808s & Heartbreak" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 31.99;
						else
							price = 27.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 30.99;
						else
							price = 25.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 24.99;
						else
							price = 23.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 22.99;
						else
							price = 19.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 18.99;
						else
							price = 16.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 15.99;
						else
							price = 14.99;
						break;
					}
				break;
			case "Graduation" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 14.99;
						else
							price = 12.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 13.99;
						else
							price = 11.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 7.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 12.99;
						else
							price = 8.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 7.99;
						else
							price = 4.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 3.99;
						else
							price = 2.99;
						break;
					}
				break;
			case "The College Dropout" :
				if (condition == "New")
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 15.99;
						else
							price = 13.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 15.99;
						else
							price = 13.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 9.99;
						break;
					}
				else
					switch (casing)
					{
					case "Hard Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 8.99;
						break;
					case "Cardboard Case" :
						if (deluxe == "Deluxe")
							price = 10.99;
						else
							price = 8.99;
						break;
					case "Paper Case" :
						if (deluxe == "Deluxe")
							price = 6.99;
						else
							price = 4.99;
						break;
					}
				break;
				
			}
			break;
		}
	}
	
	//returns the price of the CD
	public double getPrice()
	{
		return price;
	}
}
