package lab14;

public class Account {

//	=========================================================================
//					DECLARATIONS
//	=========================================================================

	private int id;
	private String owner;
	private double balance;

	private static int count = 0;

//	=========================================================================
//					CONSTRUCTORS
//	=========================================================================

	public Account(int id, String owner) {
		setupAccount(id, owner);
	}

	public Account(String owner) {
		this((count + 1), owner);
	}

//	=========================================================================
//					EXTERNAL METHODS
//	=========================================================================

	public void deposit(double amount) {
		System.out.println();
		System.out.println("Depositing...");
		System.out.println();

		if (amount > 0) {
			System.out.printf("Current Balance: %.2f\n", balance);
			System.out.printf("Deposit Amount: %.2f\n", amount);
			balance += amount;
			System.out.printf("New Balance: %.2f\n", balance);
		} else {
			System.err.println("You cannot deposit a negative amount of money.");
		}
	}

	public void withdraw(double amount) throws InsufficeintFundsException {
		System.out.println();
		System.out.println("Withdrawing...");
		System.out.println();

		if (amount > balance)
			throw new InsufficeintFundsException();

		System.out.printf("Current Balance: %.2f\n", balance);
		System.out.printf("Deposit Amount: %.2f\n", amount);
		balance -= amount;
		System.out.printf("New Balance: %.2f\n", balance);

	}

	public void getDetails() {
		String[] labels = { "Acc ID:", "Acc Owner:", "Balance:" };
		System.out.println();
		System.out.println("Getting Details...");
		System.out.printf("\n%10s%03d\n%s%-10s\n%10s%-10.2f\n", labels[0], id, labels[1], owner, labels[2], balance);
		System.out.println();
	}

	public void changeOpeningBalance(double balance) {
		System.out.println("Changing opening balance...");
		setBalance(balance);
		getDetails();
	}

	public void addInterest() {
		double interest = 0.025;

		System.out.println();
		System.out.println("Adding interest...");
		System.out.println();
		System.out.printf("Current Balance: %.2f\n", balance);
		System.out.printf("Interest Percentage: %.2f %%\n", (interest * 100));
		// Add interest to balance
		balance *= (interest + 1);
		System.out.printf("New Balance: %.2f\n", balance);
	}

	public void close() {
		System.out.println("Account " + this.getId() + " has been closed");
	}

//	=========================================================================
//					INTERNAL METHODS
//	=========================================================================

	private void setupAccount(int id, String owner) {
		setId(id);
		setOwner(owner);
		balance = 0.00;
		System.out.println("Account setup!");
		getDetails();
	}

//	=========================================================================
//					GETTERS & SETTERS
//	=========================================================================

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	private void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

}
