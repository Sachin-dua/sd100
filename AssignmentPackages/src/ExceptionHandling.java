import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value");

		try
		{
			int num = scanner.nextInt();
			System.out.println(10/num);
			System.out.println("ratan".charAt(90));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Enter the valid number");
		}

		catch(InputMismatchException ie)
		{
			System.out.println("Value should be an interger value");
		}

		catch(StringIndexOutOfBoundsException si)
		{
			System.out.println(si);
			si.printStackTrace();
			//System.out.println("Please ask for the valid output");
		}
		System.out.println("rest of the application");

	}
	

}

class ExceptionHandling2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the value");
		try(Scanner scanner = new Scanner(System.in))
		{
			int num = scanner.nextInt();
			System.out.println(10/num);
			System.out.println("ratan".charAt(3));
		}
//		catch(Exception e)
//		{
//			System.out.println("Exception raised...."+e);
//		}

		System.out.println("Rest of the application");


	}

}

class ExceptionHandling3
{
	void m1()
	{
		System.out.println("Hello");
		m2();
	}
	void m2()
	{
		System.out.println("Hello");
		m1();
	}
	void m3()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		ExceptionHandling3 eh=new ExceptionHandling3();
		eh.m2();
	}
}


class FinallyBlock 
{
	public static void main(String[] args) 
	{
		try
		{
			//System.out.println(10/0);
			System.out.println("try");
			System.exit(0); //JVM will shutdown
		}
//		catch(ArithmeticException ae)
//		{
//			System.out.println("catch");
//		}
		
		finally
		{
			System.out.println("finally");
		}
		
	}
	
}
class FinallyBlock2 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Ratan".charAt(10));
		}
		
		finally
		{
			int[] a = {10,20,30,40};
			System.out.println(a[10]);
			
		}
		
	}
	
}

class Test
{
	public static void main(String[] args)  {
		Test t = new Test();
		t.officeBoy();
	}
	
	void officeBoy() 
	{
		try
		{
		principal();
		}
		catch(InterruptedException e)
		{
			System.out.println("wrong");
		}
	}
	
	void principal() throws InterruptedException
	{
		hod();
	}
	
	void hod() throws InterruptedException
	{
		studentDetails();
	}
	
	void studentDetails() throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println("Student is sleeping");
	}
}

class Test2
{
	public static void main(String[] args) 
	{
		Test2 t1= new Test2();
		try
		{
		t1.m1();
		}
		
		catch(ArithmeticException ae)
		{
		ae.printStackTrace();
		}
	}
	
	void m1()         // no need to use throws keyword in unchecked exception
	{
		System.out.println(10/0);
	}
}
