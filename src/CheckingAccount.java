

public class CheckingAccount {
	//*BEHULUM W

   private double cBalance;

	private static final double INTEREST_RATE = 0.01/100;
	
	public int years;


	public CheckingAccount (double openingBalance) {

		cBalance = openingBalance;
	
	}
	public double getBalance() {

		return getBalance();

	}

	public double getInterestRate() {

		return INTEREST_RATE;

	}

	public int years() {

		return years;

	}
		
	public boolean withdraw(double amount) {
		return ((amount <= cBalance) && (amount >= 0));
	}
	
	public boolean deposit(double amount) {
		return (amount > 0);
	}
	
	public double futureValue(int years) {
		return (cBalance*(Math.pow((1+INTEREST_RATE),years)));
		
	}
	//* behulum w
	public String toStrings() {
		return("Checking Account Balance: $" + getBalance()+ "\n" + 
				"Checking Account Interest Rate: " + getInterestRate() + "\n" +
				"Checking Account Balance in 3 years: $" + futureValue(3));
		
	}
	
}

