
public class InvalidAgeException extends Exception   
{
	// default constructor(0-arg cons)
}



class Test5
{
	static void status(int age)  
	{
		if(age>25)
		{
			System.out.println("Eligible for mrg");
		}
		else
		{
			try 
			{
			throw new InvalidAgeException();
			}
			catch(InvalidAgeException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		Test5.status(26);
	}
}