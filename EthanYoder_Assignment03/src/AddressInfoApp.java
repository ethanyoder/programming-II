/* Name: Ethan Yoder
 * Date: March 28, 2016
 * Purpose: This simple GUI allows the user to enter an IP address.  
 * If it is a valid IP address, it will then return the class, whether it is private or not, and the 
 * binary equivalent.
 * This assignment has also been designed to give students an early glimpse of GUIs.
 * 
 * Note: Start by running the program to see what it does 
 */

//---------DO NOT MODIFY (really can if you want, but should not be needed to complete the assignment -------------------------------------
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddressInfoApp extends JFrame{
	private final int WINDOW_WIDTH = 300;	// Window width in pixels 
	private final int WINDOW_HEIGHT = 300; 	// Window height in pixels
	private Pattern p;						// For determining if the IP address is really an IP address
	private Matcher m;
	private char addressClass;				// Used to store what is returned by each method
	private boolean isAddressPrivate;
	private String addressBinary;
	
	private JLabel ipLabel;
	private JTextField ipTextField;
	private JButton submitButton;
	private JLabel infoLabel;
	private JLabel classLabel;
	private JTextField classTextField;
	private JLabel privateLabel;
	private JCheckBox privateCheckBox;
	private JLabel binaryLabel;
	private JTextField binaryTextField;
	
	// Do not change the following line
	private String ip;
	
	public AddressInfoApp(){
		super("IP Address Info");		// Sets title of the window
		
		setLayout(new GridLayout(6,2));	// Uses a grid layout, 6 rows with 2 columns
		
		// Setup pattern for valid IP Address
		p = Pattern.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5]).){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
		
		ipLabel = new JLabel("IP Address");
		ipTextField = new JTextField();
		submitButton = new JButton("Submit");
		submitButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {	// Is invoked when the user clicks the button to get the information
				ip = ipTextField.getText();
				m = p.matcher(ip);
				
				if(!m.find()){ 			// Not a valid IP address
					Frame frame = (JFrame) JFrame.getFrames()[0];
					JOptionPane.showMessageDialog(frame, "Not a valid IP Address -- Please enter a valid IP address.");	
				}
				else{					// Is a valid IP address
					ip = ipTextField.getText();
					addressClass = getAddressClass();
					isAddressPrivate = getPrivate();
					addressBinary = getBinary();
					
					classTextField.setText(""+addressClass);
					privateCheckBox.setSelected(isAddressPrivate);
					binaryTextField.setText(addressBinary);
				}
			}
			
		});
		
		infoLabel = new JLabel("Info");
		infoLabel.setFont(new Font("Arial", Font.PLAIN, 24));
		classLabel = new JLabel("Class");
		classTextField = new JTextField();
		privateLabel = new JLabel("Private");
		privateCheckBox = new JCheckBox();
		binaryLabel = new JLabel("Binary");
		binaryTextField = new JTextField();
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT); 			// Sets the window size
		add(ipLabel);
		add(ipTextField);
		add(new JLabel(""));
		add(submitButton);
		add(infoLabel);
		add(new JLabel(""));
		add(classLabel);
		add(classTextField);
		add(privateLabel);
		add(privateCheckBox);
		add(binaryLabel);
		add(binaryTextField);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Specify what happens when the close button is clicked. 
		setVisible(true);								// Display the window
	}
	
	/* The following method is a setter that I used solely for writing my JUnit tests.	 */
	public void setIP(String ip){
		this.ip = ip;
	}
	//--------------------------END OF DO NOT MODIFY---------------------------------------

	/* Finish the code in this method. 
	 * This method determines the address class (see http://www.vlsm-calc.net/ipclasses.php)
	 * It then returns the appropriate letter (A - E) in uppercase.
	 */
	public char getAddressClass(){
		// To do: put your program logic here
		//creates object and parses it to integers.  This helps for creating the conditions
		StringTokenizer stk = new StringTokenizer(ip, ".");
		int octet1 = Integer.parseInt(stk.nextToken());
		//looks at the range of the first octet to determine the class the ip address is in
		if (octet1 >= 1 && octet1 <= 126)
			return 'A';
		else if (octet1 >= 128 && octet1 <= 191)
			return 'B';
		else if (octet1 >= 192 && octet1 <= 223)
			return 'C';
		else if (octet1 >= 224 && octet1 <= 239)
			return 'D';
		else
			return 'E';
	}
	
	/* Finish the code in this method. 
	 * If the IP address is a private address, it should return true, otherwise it will return false.
	 */
	public boolean getPrivate(){
		// To do: put your program logic here
		//creates object
		StringTokenizer stk = new StringTokenizer(ip, ".");
		//since you can determine private from the first two octets, only they are evaluated
		int octet1 = Integer.parseInt(stk.nextToken());
		int octet2 = Integer.parseInt(stk.nextToken());
		//looks if the octets match the private range for any of the three classes
		if ((octet1 == 10) || (octet1 == 172 && octet2 >= 16 && octet2 <= 31) || (octet1 == 192 && octet2 == 168))
			return true;
		else
			return false;
	}
	
	/* Finish the code in this method. 
	 * This method takes the IP address and creates a binary equivalent of that IP address.
	 */
	public String getBinary(){
		// To do: put your program logic here
		//creates variables and objects
		DecimalFormat formatter = new DecimalFormat("00000000");
		StringTokenizer octets = new StringTokenizer(ip, ".");
		String binary = "";
		//creates array to hold tokens as integers
		int[] octetArray = {Integer.parseInt(octets.nextToken()), Integer.parseInt(octets.nextToken()), Integer.parseInt(octets.nextToken()), Integer.parseInt(octets.nextToken())};
		/* loops through array, converts to a binary string, and then parses the values to a 
		   double.  This allows the formatter method to work properly.  In addition, the if
		   statement ensures that dots are put between the octets, but not at the end.
		*/
		for (int i = 0; i < octetArray.length; i++)
		{
			binary += formatter.format(Double.parseDouble((Integer.toBinaryString(octetArray[i]))));
			if (i < 3)
				binary += ".";
		}
		return binary;
	}
	
	// No need to modify this
	public static void main(String[] args){
		AddressInfoApp gui = new AddressInfoApp();
	}

}
