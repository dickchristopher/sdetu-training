package oop;

public class BankAccount {
	// Define variables
	String accountNumber;
	
	
	private static final String routingNumber = "012374";
	String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
		// 1. They are used to define / setup / initialize prperties of an object
		// 2. Constructors are IMPLICITLY called upon INSTANTIATION
		// 3. The same name as the class itself
		// 4. Constructor have NO return type
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000";
		} else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	
	// Getters / Setters
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr." + name;
	}
	public String getName() {
		return name;
	}		
	
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	
	// Private: can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANACTION " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("BAlance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	
	@Override
	public String toString() {
		return "[ " + name + ". ACCOUNT#" + accountNumber + ". ROUTING#" + routingNumber + ". BALANCE: $" + balance + " ]";
	}

}
