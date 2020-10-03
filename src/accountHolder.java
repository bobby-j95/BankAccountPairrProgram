
public class accountHolder {
	
	/*Default constructor
	 * Created by Behulum W
	 */
	public void AccountHolder() {
		
	}
	/*Constructor with initial values
	 * Created by Robert J
	 */
	public void AccountHolder(String firstName, String middleName, String lastName, String ssn, 
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}
	
	/* Setter for first name
	 * created by behulum w
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/* getter for first name 
	 * created by behulum w
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/* Setter for middle name
	 * created by Robert J
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	/* getter for middle name 
	 * created by Robert J
	 */
	public String getMiddleName() {
		return middleName;
	}
	
	/* Setter for last name
	 * created by behulum w
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/* getter for last name 
	 * created by behulum w
	 */
	public String getlastName() {
		return lastName;
	}
	
	/* Setter for Social Security Number
	 * created by Robert J
	 */
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	/* getter for Social Security Number 
	 * created by Robert J
	 */
	public String getSSN() {
		return ssn;
	}
	
	/* getter for checking Account
	 * created by behulum w
	 */
	public CheckingAccount getCheckingAccount() {
		return CheckingAccount(checkingAccountOpeningBalance);
	}
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
}
	