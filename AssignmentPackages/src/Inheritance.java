
public class Inheritance {

}

class Parent
{

	void multiply()
	{
		System.out.println(4*3);
	}
	void addition()
	{
		System.out.println(4+3);
	}
}

class Child  extends Parent
{
	 void substraction()
	{
		System.out.println(4-3);
	}

	public static void main(String[] args)
	{
		Child ch = new Child();
		ch.addition();
		ch.multiply();
		ch.substraction();
	}
}

class Child2 extends Child
{

	public static void main(String[] args)
	{
		Child2 ch2 = new Child2();
		ch2.substraction();
		ch2.addition();
		ch2.multiply();
		System.out.println(ch2 instanceof Child);
	}


}

class Child3 extends Parent
{
	public static void main(String[] args)
	{
		Child3 ch3 = new Child3();
		ch3.addition();
		ch3.multiply();
		System.out.println(ch3 instanceof Parent);
	}
}

class Parent2 {
	int a=10;
	Parent2()
	{
		System.out.println("Parent const");
	}
}

class ChildP extends Parent2
{
	ChildP()
	{
		System.out.println(super.a);
		System.out.println("0 arg child cont");
	}

	ChildP(int a)
	{
		this();

		System.out.println("1 arg child const:"+ a);
	}

	public static void main(String[] args)
	{

		new ChildP(10);
		new ChildP();
	}
}