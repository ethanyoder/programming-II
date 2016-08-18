//Ethan Yoder
//March 1, 2016
//Purpose: To hold the transaction made in a bank account

package ICE5;

public class CheckingAccount extends BankAccount {

	//declares attributes
	private int transactionCount;
	
	//creates default constructor
	public CheckingAccount() {
		super();
		transactionCount = 0;
	}
	
	//creates overloaded constructor
	public CheckingAccount(double balance) {
		super(balance);
		transactionCount = 0;
	}
	
	public void deposit(double amount)
	{
		transactionCount ++;
		super.deposit(amount);
		deductFees();
	}
	
	public void withdraw(double amount) {
		transactionCount ++;
		super.withdraw(amount);
		deductFees();
	}
	
	public void deductFees() {
		if (transactionCount > 3) {
			super.withdraw(2);
			transactionCount = 0;
		}
	}
	
	
}
