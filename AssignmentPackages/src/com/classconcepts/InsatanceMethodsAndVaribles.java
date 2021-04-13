package com.classconcepts;

public class InsatanceMethodsAndVaribles {
	
	 int a=10;
	 int b =20;
	
	public static void main(String[] args) {
		InsatanceMethodsAndVaribles t = new InsatanceMethodsAndVaribles(); 
		// you can't use the instance variable directly in the static method
		// object creation is required
		System.out.println(t.a);
		System.out.println(t.b);
	}

}

class Demo
{
	int num1,num2;	

	Demo(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
}

class Test
{
	void add() 
	{
		Demo d = new Demo(4,5);
		int sum= d.num1+d.num2;
		System.out.println(sum);

	}
	void mul() 
	{
		Demo d1 = new Demo(5,3);
		int mul= d1.num1*d1.num2;
		System.out.println(mul);

	}
	static void mul2() 
	{
		Demo d1 = new Demo(4,3);
		int mul= d1.num1*d1.num2;
		System.out.println(mul);

	}

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.add();
		t1.mul();
		//t1.mul2(); valid but not recommended
		Test.mul2();
	}
  
  
}

class Variables
{
	int a;
	static boolean b;
	
	public static void main(String[] args) 
	{
		Variables v = new Variables();
		System.out.println(v.a);
		System.out.println(Variables.b);
		
	}
	
}
