
//Rule 1: Unchecked exception are valid at the class level even though parent class does not throw any unchecked exception
class Parent
{
	public void add()
	{
		int sum = 7+8;
		System.out.println(sum);
	}
}

public class ExHnadlingTest extends Parent 
{
	public void add() throws ArithmeticException
	{
		System.out.println(7+8);
	}
	public static void main(String[] args) 
	{
		ExHnadlingTest ex = new ExHnadlingTest();
		ex.add();

	}

}
//-----------------------------------------------------------------------------------------------------------------------------------------------------//
//Rule 2: You can not throw checked exception at the child level if parent is not throwing the checked exception

class Parent2
{
	public void add()
	{
		int sum = 7+8;
		System.out.println(sum);
	}
}

class ExHnadlingTest2 extends Parent2 
{
	public void add() throws InterruptedException  //Exception InterruptedException is not compatible with throws clause in Parent2.add()
	{
		System.out.println(7+8);
	}
	public static void main(String[] args) 
	{
		ExHnadlingTest2 ex = new ExHnadlingTest2();
		ex.add();

	}

}
//-----------------------------------------------------------------------------------------------------------------------------------------------------//

class Parent3 
{
	public void add() throws Exception
	{
		int sum = 7+8;
		System.out.println(sum);
	}
}

class ExHnadlingTest3 extends Parent3 
{
	public void add()   //Exception InterruptedException is not compatible with throws clause in Parent2.add()
	{
		System.out.println(7+8);
	}
	public static void main(String[] args) 
	{
		ExHnadlingTest3 ex = new ExHnadlingTest3();
		ex.add();
	}

}
//-----------------------------------------------------------------------------------------------------------------------------------------------------//


