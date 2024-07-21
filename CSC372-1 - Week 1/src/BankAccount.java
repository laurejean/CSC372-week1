
public class BankAccount {
	
	//Declaration of attributes
	String firstName;
	String lastName;
	int accountID;
	Double balance;
	
	/**
	 * Default constructor
	 */
	public BankAccount() {
		firstName = "";
		lastName = "";
		accountID = 0;
		balance = 0.0;
	}
	
	/**
	 * Deposit method
	 * @param amount
	 * @return
	 */
	public void deposit(Double amount) {
		Double deposit = this.balance + amount;
		System.out.println("Your balance after the deposit is: " + deposit);
		System.out.println(" ");
	}
	
	/**
	 * Withdrawal method
	 * @param amount
	 * @return
	 */
	public void withdrawal(Double amount) {
		Double withdrawal = this.balance - amount;
		System.out.println("Your balance after the withdrawal is: " + withdrawal);
		System.out.println(" ");
	}
	/**
	 * getter & setter method
	 * @return
	 */
	
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String FirstName) {
		this.firstName = FirstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setlastName(String LastName) {
		this.lastName = LastName;
	}
	public Integer getaccountID() {
		return accountID;
	}
	public void setaccountID(Integer AccountID) {
		this.accountID = AccountID;
	}
	
	/**
	 * to get balance getter
	 * @return
	 */
	public Double getbalance() {
		return balance;
	}
	
	/**
	 * to display account summary
	 */
	public void acccountSummary() {
		System.out.println ("Your account summary is : ");
		System.out.println("First Name: "+ getfirstName());
		System.out.println("Last Name: "+ getlastName());
		System.out.println("Account ID: "+ getaccountID());
		System.out.println("Balance: "+ getbalance());
	}

}
