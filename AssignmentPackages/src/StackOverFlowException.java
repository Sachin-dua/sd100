
public class StackOverFlowException
{
	static void m1()
	{
		//m2();
		System.out.println("Hello");
	}
	
	static void m2()
	{
		System.out.println("Welcome");
		//m1();
	}
	public static void main(String[] args) throws Exception 
	{
		//StackOverFlowException.m1();
		//new Removable().m1();
		Class cls = Class.forName("Ratan");		
	}

}

class Removable
{
	void m1()
	{
		System.out.println("Hello");
	}
}




