package com.classconcepts;

public class Blocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Sachin
{	Sachin()
	{	System.out.println("0-arg constructor");
	}

	{	System.out.println("instance block");
	}

	static
	{	System.out.println("static block");
	}
	public static void main(String[] args)
	{
		new Sachin();
	}
}

class Ram
{	Ram()
	{
		this(10);
		System.out.println("0-arg constructor");
	}
	Ram(int a)
	{	System.out.println("1-arg constructor");
	}


	{	System.out.println("instance block-1");
	}
	{	System.out.println("instance block-2");
	}

	static
	{	System.out.println("static block-1");
	}
	static
	{	System.out.println("static block-2");
	}
	public static void main(String[] args)
	{	new Ram();
		new Ram(10);
	}
}