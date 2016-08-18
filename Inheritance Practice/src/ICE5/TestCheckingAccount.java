//Ethan Yoder
//March 1, 2016
//Purpose: To test the CheckingAccount class

package ICE5;

public class TestCheckingAccount {

	public static void main(String[] args) {
		
		//creates CheckingAccount object
		CheckingAccount obj = new CheckingAccount();
		CheckingAccount obj2 = new CheckingAccount(100);
		
		//deposits money into the account
		obj.deposit(50);
		obj.deposit(150);
		obj2.deposit(200);
		
		//withdraws money
		obj.withdraw(25);
		obj.withdraw(75);
		obj.withdraw(60);
		obj2.withdraw(50);
		
		//shows final balance
		System.out.println("Balance: " + obj.getBalance());
		System.out.println("Balance: " + obj2.getBalance());

	}

}
