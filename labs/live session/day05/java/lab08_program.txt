package lab08;

public class Program {

	public static void main(String[] args) {
		Utils utils = new Utils();
		
//		-----     LAB EXERCISE - Part1     -----
		
//		Account acc1 = new Account(utils.getInt("Please give the account an ID number:"), utils.getString("Who is the owner of the account:"));
//
//		acc1.deposit(utils.getDouble("How much would you like to deposit?:"));
//		acc1.withdraw(utils.getDouble("How much would you like to withdraw?:"));
//		acc1.getDetails();
		
//		-----     LAB EXERCISE - Part2 A     -----
		
//		Account myAccount = new Account(utils.getInt("Please give the account an ID number:"), utils.getString("Who is the owner of the account:"));
//		myAccount.changeOpeningBalance(utils.getDouble("Enter an amount for the opening balance:"));
//		myAccount.addInterest();
//		myAccount.getDetails(); 		// ---->  Yes the balance changed
//		
//		Account partnerAccount = myAccount;
//		partnerAccount.addInterest();
//		partnerAccount.getDetails(); 	// ---->  Yes the balance changed
//		myAccount.getDetails();			// ---->  Yes the balance changed
		
//		-----     LAB EXERCISE - Part2 B     -----
		
		int k = 100;
		System.out.printf("Before call k = %d\n", k);
		incInt(k);
		System.out.printf("After call k = %d\n", k);	// ---->  No the value did not change
		
	}
	
	public static void incInt(int x) {
		x++;
	}

}
