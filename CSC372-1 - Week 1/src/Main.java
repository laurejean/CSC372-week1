
public class Main {

	public static void main(String[] args) {
/**************************************************************Bank Account*******************************************************************************/		
		//Create object
		BankAccount client1 = new BankAccount();
		
		//initialization of attributes
		client1.firstName = "Laure";
		client1.lastName = "Jean";
		client1.accountID = 1103004597;
		client1.balance = 1400.00;
		
		//Deposit transaction
		client1.deposit(1000.00);
		
		//Withdrawal transaction
		client1.withdrawal(500.00);
		
		//Display of account summary
		client1.acccountSummary();
		System.out.println(" ");
/*************************************************************Checking Account*************************************************************************/
		
		//Creation of object
		CheckingAccount client2 = new CheckingAccount();
		
		//Initialization of attributes
		client2.firstName = "Girbson";
		client2.lastName = "Bijou";
		client2.accountID = 1104206780;
		client2.balance = 1000.00;
		client2.interestRate = 1.5;
		
		//Process withdrawal transaction
		System.out.println(client2.processWithdrawal(1500.00));
		System.out.println(" ");
		
		//Display of account
		client2.displayAccount();	
		
	}

}
