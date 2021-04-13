import java.util.Scanner;

class TooYoungException extends RuntimeException 
 {
	 TooYoungException(String str)
	 {
		 super(str);
	 }
	 
 }



public class UserDefinedException
{
	
	static void mul() 
	{
		try 
		{
			
		throw new TooYoungException("Handled");
		
		}
		
		catch(TooYoungException t)
		{
			//System.out.println(10/0);
			//t.printStackTrace();
			System.out.println("Hello");
		}
	}
	public static void main(String[] args) 
	{
	   UserDefinedException.mul();
		
	}

}


class TooOldException extends RuntimeException
{
	TooOldException(String str)
	{
		super(str);
	}
	 
}

class Test78
{
	
	static void mrg(int age)
	{
		
		if(age<18) 
		{
			throw new TooYoungException("Too young bro");
		}
		else if(age>35)
		{
			throw new TooOldException("Too old man");
		}
		
		else if((age>=18)&&(age<35))
		{
			System.out.println("Eligible for mrg");
		}
		else
		{
			System.out.println("Not a valid number");
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age= scanner.nextInt();
		Test78.mrg(age);
		String str=null;
		System.out.println(str.length());
	}
}
