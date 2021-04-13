
public abstract class AbstractionEX 
{
	int a;

	AbstractionEX()
    {
    	System.out.println("I am the constructor");
    }
	public static void main(String[] args) 
	{
		
		System.out.println("I am the first abstract class");

	}
	 abstract void methodTest();

}


class AbsImp extends AbstractionEX
{
	
	AbsImp()
	{
		super();
	}
	void methodTest()
	{
		a = 10;
		System.out.println("hello I'm the method test");
	}
	
	public static void main(String[] args) 
	{
		
		AbsImp ab = new AbsImp();
		ab.methodTest();
	}
	
}

abstract class Demo
{
	abstract String test(String username, String pwd);
	
	void add()
	{
		System.out.println(3+6);
	}
	
	// abstract void m1();
	
}

 class DemoChild extends Demo
{
	@Override
	String test(String username, String password) 
	{

		if(username.equalsIgnoreCase("Ram")&&password.equals("3456%%"))
		{
			return "Success";
		}
		
		else
		{
			return "Fail";
		}

}
}

class ServiceImp
{
	public static void main(String[] args) 
	{
		DemoChild dc = new DemoChild();
		String status = dc.test("Ram", "3456%%");
		System.out.println("Login status: "+status);
		dc.add();
	}
}
//-----------------------------------------------------------------------------------------------------------------------//
// It is not possible to override the static methods
abstract class Test
{
	abstract static void add();
	public static void main(String[] args) {
		System.out.println("asdsa");
	}
}

class Test566 extends Test
{
	static void add()
	{
		
	}
}
//---------------------------------------------------------------------------------------------------------------------//






