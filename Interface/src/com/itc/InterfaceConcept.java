package com.itc;

import com.tcs.TCS;
import com.tcs.Test89;

public class InterfaceConcept {

	public static void main(String[] args) {
		

	}

}

//you cannot create an object of the interface 
interface Test89 //abstraction
{ 
	void m1(); //public abstract
	void m2();
}

//class Yum
//{
//	Test89 tt = new Test89();
//	
//}

class TCS implements Test89
{
	public static void main(String[] args) {
		TCS t = new TCS();  // Method-1
		t.m1();
		t.m2();
		
		Test89 tt = new TCS();  // Method-2
		tt.m1();
		tt.m2(); 
	}
	public void m1()  //we can't use just void because interface methods are public by default
	{
		System.out.println("M1 method");
	}
	
	public void m2 ()
	{
		System.out.println("M2 method");
	}
	
}

//----------------------------------------------------------------------------------------------------------------------//
abstract class TCS2 implements Test89
{
	public void m2 ()
	{
		System.out.println("M2 method");
	}
	
}

class TCS3 extends TCS2
{ 
	 public void m1()
	{
	System.out.println("M1 method");
	}
	
	public static void main(String[] args) 
	{
		TCS3 tc = new TCS3();
		tc.m1();
		tc.m2();
			
	}
}
//----------------------------------------------------------------------------------------------------------------------//
//Multiple Inheritance is possible in interface unlike classes 

interface IT
{
	void m1();
}

interface IT2 extends IT
{
	void m2();
}
interface IT3 extends IT,IT2
{
	void m3();
}

//----------------------------------------------------------------------------------------------------------------------//
//It is possible to extend a class and multiple interfaces at a time
class B{
	
}

class A extends B  implements IT, IT2
{
	public void  m1()
	{
		
	}
	public void  m2()
	{
		
	}
}

//----------------------------------------------------------------------------------------------------------------------//
//Nested interface
interface It5
{
	interface It6
	{
		void m1();
	}
}

class JavaTest implements It5.It6
{
	public void m1()
	{
		System.out.println("nested inteface method");
	}
	public static void main(String[] args) 
	{
		JavaTest jt = new JavaTest();
		jt.m1();
	}
}
//----------------------------------------------------------------------------------------------------------------------//
// Nested interface - it is possible to declare the interface in the class also
 class Ptest
 {
	 interface Test
	 {
		 int i =10;  //public static final
		 void m1();  //public abstract
	 }
 }
 
 class Stest implements Ptest.Test
 {
	 public void m1()
	 {
		 System.out.println("Nested inteface ex2 "+i);
	 }
	
	 public static void main(String[] args)
	 { 
		 new Stest().m1();
	 }
 }
//----------------------------------------------------------------------------------------------------------------------//
// Ambiguity problem - if we use the same variable name in both the interface and try to access them using multiple interface concept
 class Ptest1
 {
	 interface Test
	 {
		 int i =10;  //public static final
		 void m1();  //public abstract
	 }
	 
	 interface Test2
	 {
		 int i=20; 	//public static final
		 void m2();
	 }
 }
 
 class Stest2 implements Ptest1.Test,Ptest1.Test2 
 {
	 public void m1()
	 {
		 System.out.println("Nested inteface ex2 "+i);
	 }
	 
	 public void m2()
	 {
		 System.out.println("Nested inteface ex2 "+i);
	 }
	
	 public static void main(String[] args)
	 { 
		 new Stest2().m1();
		 new Stest2().m2();
	 }
 }
 
//----------------------------------------------------------------------------------------------------------------------//
// How to get rid of ambiguity- access the variable using class name that's how we call the static variables
 class Ptest2
 {
	 interface Test
	 {
		 int i =10;  //public static final
		 void m1();  //public abstract
	 }
	 
	 interface Test2
	 {
		 int i=20;
		 void m2();
	 }
 }
 
 class Stest3 implements Ptest2.Test,Ptest2.Test2 
 {
	 public void m1()
	 {
		 System.out.println("Nested inteface ex2 "+Ptest2.Test.i);
	 }
	 
	 public void m2()
	 {
		 System.out.println("Nested inteface ex2 "+Ptest2.Test2.i);
	 }
	
	 public static void main(String[] args)
	 { 
		 new Stest3().m1();
		 new Stest3().m2();
	 }
 }
//----------------------------------------------------------------------------------------------------------------------//
 
 interface ITtest
 {
	 void method1();
	 void method2();
	 void method3();
 }
 
 abstract class Sachin implements ITtest
 {
	 public void method1()
	 {
		 
	 }
 }
 
 abstract class Sachin2 extends Sachin
 {
	 public void method2()
	 {
		 
	 }
 }
 
  class Sachin3 extends Sachin2
 {
	@Override
	public void method3()
	{

		
	}
 }
 
//----------------------------------------------------------------------------------------------------------------------//
 // Problem - we need to implements all the interface methods
  // Solution - Adaptor class
  
  class Wipro implements ITtest
  {
	 public void method1()
	 {
		 System.out.println("M1 method");
	 }
	 
	 public void method2() {}  //empty implementation
	 public void method3() {}
 
  }
  
  class WiproTest extends Wipro
  {
	  public static void main(String[] args) 
	  {
	  new Wipro().method1();   // accessing only the required method 
	  }
  }
  
//----------------------------------------------------------------------------------------------------------------------//
// Marker interface
  //object cloning 
  // if you want to perform cloning your class must contain cloneable interface
  class TTest implements Cloneable
  {
	 
		  int a=12;
		  int b =34;
	  

	  public static void main(String[] args) throws CloneNotSupportedException 
	  {
		TTest tt = new TTest();
		tt.a=90;
		tt.b=89;
		System.out.println(tt.a);
		System.out.println(tt.b);
		
		
			TTest tt2 = (TTest) tt.clone();
	
		
		tt.a=999;
		tt.b=8779;
		System.out.println(tt.a);
		System.out.println(tt.b);
		
		
		// to get the previous values
		System.out.println(tt2.a);
		System.out.println(tt2.b);
		
		
		
	  }
	  
  }
		
	
  
  
  
 
 
 
 
 
 
 
 
 
 
 
 