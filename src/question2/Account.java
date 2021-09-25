package question2;
import java.time.LocalDate;
public class Account 
{
	int accountNumber;
	String accountHolderName;
	LocalDate openedDate;
	double balance;
	public Account(int accountNumber, String accountHolderName, double balance)
	{
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		//this.openedDate = openedDate.now();
		this.balance = balance;
	}
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() 
	{
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	private String validateAccountHolderName(String accountHolderName)
	{
		if(this.accountHolderName == null)
			return "Invalid Name Enter Your Name Properly";
		else
			return accountHolderName;
	}
	public LocalDate getOpenedDate()
	{
		return openedDate;
	}
	public void setOpenedDate(LocalDate openedDate)
	{
		this.openedDate = openedDate;
	}
	public double getBalance()
	{
		return balance;
	}
	private double validateBalance(double balance)
	{
		if(this.balance<5000)
			return 0;
		else
			return balance;
	}
	public void setBalance(double balance) 
	{
		this.balance = balance;
	}
	public void showAccountDetails()
	{
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Balance : "+balance);
	}
}
