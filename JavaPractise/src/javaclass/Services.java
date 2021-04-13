package javaclass;

import java.util.Scanner;

public class Services {
	
	void register(String name,int mobile, int age, String sscRollNo)
	{
		if(age>18)
		{
			System.out.println("Eligible for voting");
			System.out.println("Your voter id number"+ mobile+sscRollNo);
		}
		else
		{
			System.out.println("Not eligible");
		}
	}
	
	static void marry(String name,int age,double bankBalance)
	{
		if(age<18)
		{
			System.out.println("Not eligible try after some time....");
		}
		else if(age>35)
		{
			System.out.println("Sorry you're too late...");
		}
		else if(age>=18 &&age<=34) 
		{
			System.out.println("Eligible for marriage");
		}
		else
		{
			System.out.println("Wrong Input");
		}
	}
	
	
	

	public static void main(String[] args) 
	{
		Services s= new Services();
		s.register("Ram",987899,22,"sc2345");	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Enter age");
		int age= scanner.nextInt();
		System.out.println("Enter BankBalance");
		double bankBln= scanner.nextDouble();
		Services.marry(name, age, bankBln);
		

	}

}
