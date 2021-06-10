import com.BankAccount;

public class BankAccountTest {
	
	public static void main(String[] args) {
		
		BankAccount Joe = new BankAccount();
		BankAccount Billy = new BankAccount(350.91, 57900);
		
		System.out.println("Total Number of accounts: " + BankAccount.getTotalAccounts());
		System.out.println("Total amount in all accounts: " + BankAccount.getTotalBalance());
		
		System.out.println("Joe's Account");
		Joe.showAccInfo();
		
		System.out.println("Billy's Account");
		Billy.showAccInfo();
		
		System.out.println("Joe depositing money");
		Joe.depositChecking(500.66);
		Joe.depositSavings(25005);
		Joe.showAccInfo();
		
		System.out.println("Billy depositing money");
		Billy.depositChecking(50.32);
		Billy.depositSavings(5980);
		Billy.showAccInfo();
		
		System.out.println("Total amount in all accounts: " + BankAccount.getTotalBalance());
		
		System.out.println("Joe withdrawing money");
		Joe.withdrawChecking(600);
		Joe.withdrawSavings(5000);
		Joe.showAccInfo();
		
		System.out.println("Billy withdrawing money");
		Billy.withdrawChecking(50);
		Billy.withdrawSavings(6000);
		Billy.showAccInfo();
		
		System.out.println("Total amount in all accounts: " + BankAccount.getTotalBalance());
		
	}
}
