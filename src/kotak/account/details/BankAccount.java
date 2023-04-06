// package name should be camelcase
package kotak.account.details;
// Class name should be pascalcase
public class BankAccount {
// data types should be there under class	
	Integer accountNumber = 1234,accountNumber1 = 2345;
	String holderName = "shya",holderName1 = "Riya";
	Integer accountBalance=5000;
// getdetails is a method created to get account details
	public void getdetails()
	{
		System.out.println("The account balance is "+ accountBalance);
		System.out.println("The account holder Name is "+ holderName);
	}
	public void increment()
	{
		int incr=500, newBalance;
		newBalance=incr+accountBalance;
		System.out.println("The new Balance is "+ newBalance);
	}
// main function and the account object is created	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.getdetails();
		account.increment();
	}
}
