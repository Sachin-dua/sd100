package com.classconcepts;

class Utest
{
	static
	{
		System.out.println("Hello I'm static");
	}
	void m1()
	{
		System.out.println("method m1");
	}
}


 class ForNameLoading {

	public static void main(String[] args)
	{

		//new Utest();
		try
		{
		Class c= Class.forName("com.classconcepts.Utest"); //as the classes are in the package we need to use the complete name
		Utest u = (Utest) c.newInstance();  // we have to typecast it because we don't know what kind of object it is for eg: Utest u = new Utest(); we are specifying the type of the object.
		u.m1();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
