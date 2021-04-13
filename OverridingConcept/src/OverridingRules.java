// Rule 1: Cannot reduce the visibility of the inherited method 
public class OverridingRules 
{
	public void m1()
	{
		System.out.println("Hi I'm a static method");
	}
}

class OverridingChild extends OverridingRules
{
	void m1()
	{
		System.out.println("Overriding");
	}
	public static void main(String[] args) {
		new OverridingChild().m1();
		
	}
}
//-----------------------------------------------------------------------------------------------------------------------------------------//
// Rule 2: it is possible to increase the visibility of the inherited method
 class OverridingRules2 
{
	 void m1()
	{
		System.out.println("Hi I'm a static method");
	}
}

class OverridingChild2 extends OverridingRules
{
	public void m1()
	{
		System.out.println("Overriding");
	}
	public static void main(String[] args) {
		new OverridingChild().m1();
		
	}
}
//-----------------------------------------------------------------------------------------------------------------------------------------//
//Rule 3:
class OverridingRule3
{
	void m1()
	{
		System.out.println("I am the parent class method");
	}
}
class OverridingChild3 extends OverridingRule3
{
	void m1()
	{
		System.out.println("I am the child class method");
	}
	
	public static void main(String[] args) 
	{
		//OverridingChild3 c = (OverridingChild3) new OverridingRule3();
		//c.m1();
	
		OverridingRule3 p = new OverridingChild3();  // we're creating the object of child class
		p.m1(); // child class method will be executed
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------//
//Rule 4: you cannot override the static methods because the execution is decided by the class name
class OverridingRule4
{
	static void m1()
	{
		System.out.println("I am the parent class method");
	}
}
class OverridingChild4 extends OverridingRule4
{
	static void m1()
	{
		System.out.println("I am the child class method");
	}
	
	public static void main(String[] args) 
	{
		OverridingRule4 p = new OverridingChild4();  // we're creating the object of child class but static method execution is decided by class-name which is OverridingRule4
		p.m1(); // parent class method will be executed because we cannot override the parent methods
	}
}

//-----------------------------------------------------------------------------------------------------------------------------------------//
//Overriding method cannot have the different return type
class Parent4 
{
	public void add() throws Exception
	{
		int sum = 7+8;
		System.out.println(sum);
	}
}

class ExHnadlingTest4 extends Parent4 
{
	public int add()   //return type must be same(void)
	{	
		System.out.println(7+8);
	}
	public static void main(String[] args) 
	{
		ExHnadlingTest4 ex = new ExHnadlingTest4();
		ex.add();
	}

}
//-----------------------------------------------------------------------------------------------------------------------------------------//\
// Covariant return type
class Animal
{	
	void add()
	{
		System.out.println("Animal sum is: "+4+8);
	}
}

class Dog extends Animal
{
	void add()
	{
		System.out.println("Dog sum is: "+8+8);
	}
}

class Parent
{
	Animal eat()
	{
		Animal a = new Animal();
		a.add();
		return a;
	}
}

class Child extends Parent
{
	Dog eat()
	{
		Dog d = new Dog();
		d.add();
		return d;
	}
	
}

class Main
{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		p.eat();
		
		Child c = new Child();
		c.eat();
	}
}


class Test{
	public String sum()
	{
		String s = "Excellent";
		return s;
	}
	
}

class Method
{
	Test add()
	{
		Test t = new Test();
		String msg=t.sum();
		System.out.println(msg);
		int a=10,b=23;
		System.out.println(a+b);
		return t;
	}
	public static void main(String[] args) {
		Method m = new Method();
		m.add();
	}
}


