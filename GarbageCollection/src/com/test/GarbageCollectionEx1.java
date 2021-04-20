package com.test;

import java.io.IOException;

class Emp
{
	int eid;
	String ename;
	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	void m1()
	{
		System.out.println("object destroyed");
	}
	
}


public class GarbageCollectionEx1 
{
	public static void main(String[] args) 
	{
		Emp e = new Emp(11,"sachin");
		Emp e2 = new Emp(21,"ratan");
	 	e.m1();
		e2.m1();
	//	System.out.println(e);
		//System.out.println(e2);
		System.out.println(e.getClass());
		System.out.println(e.getClass().getName());
		e=null;
		e2=null;
		
	System.out.println(e);
	System.out.println(e2);
	
	System.gc();
//		
//		System.out.println(e);
//		System.out.println(e2);
		
		
	}
}

class Student
{
	public void finalize()
	{
		System.out.println("Student obj is destroyed");
	}
}

class Teacher
{
	public void finalize()
	{
		System.out.println("Teacher obj is destroyed");
	}
}

class Test
{	public void finalize()
{
	System.out.println("Test obj is destroyed");
}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t=null;
		
		Student s = new Student();
		s=null;
		
		Teacher tt = new Teacher();
		t=null;
		
		System.gc();
		
		Runtime r = Runtime.getRuntime();
		r.gc();
		
	}
}

class RuntimeTest
{
	public static void main(String[] args) 
	{
		Runtime r = Runtime.getRuntime();
		System.out.println(r.totalMemory());
		System.out.println(r.freeMemory());
		
		for(int i=0;i<100000;i++)
		{
			new RuntimeTest();
		}
		
		System.out.println(r.freeMemory());	
		r.gc();
		System.out.println(r.freeMemory());
		try {
			r.exec("calc");
			r.exec("notepad");
			r.exec("mspaint");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
// nullifying the object
class A
{
	public static void main(String[] args) {
		A a = new A();
		a=null;
		
	}
	
}
// providing reference to another object
class T1
{
	public static void main(String[] args) {
		T1 t1 = new T1();
		T1 t2 = new T1();
		t1=t2;
		
		
	}
}

// nameless object
class TestClient
{
	void method1()
	{
		System.out.println("method 1 is here");
	}
	public static void main(String[] args) {
		 new TestClient().method1();;
	}
}

// How finalize method works using System.gc()
class Tcs
{
	public static void main(String[] args) {
		Tcs tc1 = new Tcs();
		Tcs tc2 = new Tcs();
		Tcs tc3 = new Tcs();
		
		tc1=null;
		tc2=null;
		tc3=null;
		
		System.gc();
		System.out.println("Garbage collection completed");
	
	}
	
	public void finalize()
	{
		System.out.println("Garbage Collected");
		
	}
}

//How finalize method works using Runtime
class ClentIcs
{
	public static void main(String[] args) {
		ClentIcs tc1 = new ClentIcs();
		ClentIcs tc2 = new ClentIcs();
		ClentIcs tc3 = new ClentIcs();
		
		tc1=null;
		tc2=null;
		tc3=null;
		
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		System.out.println("Garbage collection completed");
	
	}
	
	public void finalize()
	{
		System.out.println("Garbage Collected");
		
	}
}


































