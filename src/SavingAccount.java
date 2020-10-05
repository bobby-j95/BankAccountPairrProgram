
/*Savings Account class for user
 * Created by Robert J
 */
public class SavingAccount {
	
	//All constants needed in class
	private static final double INTEREST_RATE = .01;
	
	//Default constructor
	public void SavingAccount(double openingBalance) {
		this.openingBalance = openingBalance;
	}
	
	//returns balance
	public double getBalance() {
		return openingBalance;
	}
	
	//returns interest rate
	public double getInterestRate() {
			return INTEREST_RATE;
	}
		
	//checks to see if amount is too much to be withdrawn or negative
	public boolean withdraw(double amount) {
		return ((amount <= openingBalance) && (amount >= 0));
	}
	
	//checks to see if amount is negative for deposit
	public boolean deposit(double amount) {
		return (amount > 0);
	}
	
	//gets future value after an amount of time in years
	public double futureValue(int years) {
		return (openingBalance*(Math.pow((1+INTEREST_RATE),(years%12))));
	}
	
	private String toStrings() {
		return("Savings Account Balance: $" + getBalance()+ "\n" + 
				"Savings Account Interest Rate: " + getInterestRate() + "\n" +
				"Savings Account Balance in 3 years: $" + futureValue(36));
	}
	
	//All private variables needed in the program
	private double openingBalance;
}