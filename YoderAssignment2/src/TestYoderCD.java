//Ethan Yoder
//Febrauary 11, 2016
/*Purpose: To test the YoderCD class.  This class will also be the means for the user to
 * enter their orders through a GUI.
 */

//Imports classes
import cdStore.YoderCD;
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class TestYoderCD {

	public static void main(String[] args) {
		
		//Declares attributes
		int choice;
		int[] detailNums = new int[5];
		double total = 0;
		String receipt = "";
		String[] artists = {"Switchfoot", "Tenth Avenue North", "Toby Mac", "dc Talk", "Kanye West"};
		//This 2D array holds the artist's albums as well as options for casing, deluxe edition, and condition of CD
		String[][] otherInfo = {{"Fading West", "Hello Hurricane", "Oh! Gravity", "The Beautiful Letdown"},
						   		{"Cathedrals", "The Struggle", "The Light Meets the Dark", "Over and Underneath"},
						   		{"Eye on It", "Tonight", "Portable Sounds", "Momentum"},
						   		{"Supernatural", "Jesus Freak", "Free at Last", "Nu Thang"},
						   		{"My Beautiful Dark Twisted Fantasy", "808s & Heartbreak", "Graduation", "The College Dropout"},
						   		{"New", "Used"},
						   		{"Hard Case", "Cardboard Case", "Paper Case"},
						   		{"Deluxe Edition", "Original Edition"}};
		ArrayList<YoderCD> list = new ArrayList<>();
		ArrayList<Integer> quantity = new ArrayList<>();
		DecimalFormat f = new DecimalFormat("#0.00");
		
		//Greets user, asks if they would like to purchase a CD, and asks for desired CD information
		choice = JOptionPane.showConfirmDialog(null, "Welcome to the Yoder CD Store! Would you like to purchase a CD?", "Welcome", JOptionPane.YES_NO_OPTION);
		if (choice == 0)
			while (choice == 0)
			{
				detailNums[0] = JOptionPane.showOptionDialog(null, "Choose an Artist", "Artists", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, artists, 0);
				detailNums[1] = JOptionPane.showOptionDialog(null, "Choose an Album", "Albums", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, otherInfo[detailNums[0]], 0);
				detailNums[2] = JOptionPane.showOptionDialog(null, "Choose a CD Condition", "Condition", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, otherInfo[5], 0);
				detailNums[3] = JOptionPane.showOptionDialog(null, "Choose the CD Casing", "Casing", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, otherInfo[6], 0);
				detailNums[4] = JOptionPane.showOptionDialog(null, "Deluxe or Original Edition?", "Edition", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, otherInfo[7], 0);
				list.add(new YoderCD(artists[detailNums[0]], otherInfo[detailNums[0]][detailNums[1]], otherInfo[5][detailNums[2]], otherInfo[6][detailNums[3]], otherInfo[7][detailNums[4]]));
				choice = JOptionPane.showConfirmDialog(null, "Your order has been processed.  Would you like to purchase another CD?", "Thank You!", JOptionPane.YES_NO_OPTION);
			}
		else
		{
			JOptionPane.showMessageDialog(null, "Have a nice day!");
			System.exit(0);
		}
		
		//Finds the prices of each order using the getPrice() method
		for (YoderCD obj : list)
			total += obj.getPrice();
		
		//Copies each order into an ArrayList of Strings using the toString() method
		ArrayList<String> orders = new ArrayList<>();
		for (YoderCD obj : list)
			orders.add(obj.toString());
		
		//sorts the ArrayList of Strings
		Collections.sort(orders);
		
		/* Each member of this ArrayList holds a quantity of a certain type of CD that was ordered.
		 * That is why the first member is assigned a value of 1.  The for loop created below will
		 * check if orders are equal.  If they are, a member's value will be incremented.  If
		 * not, a new member will be created and will be initialized at 1.
		 */
		quantity.add(1);
		for (int i = 1, j = 0; i < orders.size(); i++)
		{
			if (orders.get(i).equals(orders.get(i - 1)))
				quantity.set(j, quantity.get(j) + 1);
			else
			{
				j++;
				quantity.add(1);
			}
		}

		//This for loop brings the orders and quantities into one receipt
		for (int i = 0, j = 0; i < quantity.size(); i++)
		{
			receipt += (quantity.get(i) + "  " + orders.get(j) + "\n");
			j += quantity.get(i);
		}
		
		//prints out the final sorted receipt to user
		JOptionPane.showMessageDialog(null, receipt + "\nTotal: $" + f.format(total) + "\n\nTax: $" + f.format(total * .06) + "\n\nGrand Total: $" + f.format(total * 1.06));
		
		//Sends a closing message to the customer
		JOptionPane.showMessageDialog(null, "Have a nice day!");

	}

}
