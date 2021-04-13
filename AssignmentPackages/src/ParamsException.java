
public class ParamsException extends Exception
{
	ParamsException(String name)
	{
		super(name); //calling super class (Exception class)  cons by passing our info
		// if we don't passing the params value to the user class then mesaage won't be displayed 
	}

}


class Test10 
{
	static void mrg(int age)
	{
		if(age>18)
		{
			System.out.println("Eligible");
		}
		
		else
		{
			try 
			{
			throw new ParamsException("you are not eligible");
			}
			catch(ParamsException e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) 
	{
		Test10.mrg(15);
	}
}