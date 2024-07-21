
public class CheckingAccount extends BankAccount {
	
	//Declaration of attributes
	Double interestRate;
	final static int OVERDRAFT_FEE = 30;
	
	/**
	 * To process withdrawal
	 * @param amount
	 * @return
	 */
	public Double processWithdrawal(Double amount) {	
		Double currentBal = getbalance() - amount;
		if(currentBal < 0) {
			balance = currentBal - OVERDRAFT_FEE;
			System.out.println("Your account is currently overdrawn. A $30 overdraft fee has been added. Immediate action is needed");
			System.out.print("your balance is: ");
			return balance;	
			
		}
		else{
			System.out.print("Your account balance is: ");
			return currentBal;
		}
	}
	
	/**
	 * To display account informations
	 */
	public void displayAccount() {
		System.out.println ("Your account informations are : ");
		System.out.println("First Name: "+ getfirstName());
		System.out.println("Last Name: "+ getlastName());
		System.out.println("Account ID: "+ getaccountID());
		System.out.println("Balance: "+ getbalance());
		System.out.println("Interest rate: " + interestRate + "%");	
	}
	
}

