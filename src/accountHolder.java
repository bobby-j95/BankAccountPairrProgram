
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
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
}
	