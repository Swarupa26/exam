package question2;

public class InsufficientBalanceException extends RuntimeException 
{	
	private String message;
	InsufficientBalanceException() { }
	public InsufficientBalanceException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	public String toString()
	{
		return message;
	}
	
}
