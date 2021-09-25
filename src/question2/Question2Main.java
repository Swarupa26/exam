package question2;
import java.time.LocalDate;

//import question2.Account;
//import question2.Transaction;
//import question2.InsufficientBalanceException;
public class Question2Main 
{
	public static void main(String[] args)
	{
		Account a1 = new Account(1007,"rosy",5217.21);
		Transaction t = new Transaction();
		
		try
		{
			a1.showAccountDetails();
			t.deposit(a1, 1000);
			t.withdraw(a1,4000);
		}
		catch(InsufficientBalanceException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
