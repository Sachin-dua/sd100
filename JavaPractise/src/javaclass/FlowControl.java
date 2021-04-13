package javaclass;

import java.util.Scanner;
import static java.lang.System.*;  


public class FlowControl {

	public static void main(String[] args) {
		int a[]= {10,20,30,40};

		for(int i=2;i<a.length;i++) { //if we want to print the array values with conditions we use for loop
			out.print(a[i]);
		}
		out.println();
		for(int aa:a) {
			out.print(aa); 
		}
		out.println();
		int k= 0;
		while(k<a.length) {
			out.print(a[k]);
			k++;
		}

	}
}

class TestWhile 
{
	public static void main(String[] args) 
	{
		int guess=25;
		Scanner scanner = new Scanner(in);
		while(true) 
		{
			out.println("Enter the guess value:");
			int userguess = scanner.nextInt();

			if(userguess==guess) 
			{
				out.println("You entered the correct value");
				break;
			}
			else if(userguess>guess) 
			{
				out.println("You entered the bigger value");
			}		
			else
			{
				out.println("You enter the smaller value");
			}

		}

	}
}

class Assignment 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(in);
		out.println("Employee id");
		int empid= scanner.nextInt();
		out.println("Employee id: "+empid);
		out.println("Employee name");
		String empname=scanner.next();
		out.println("Employee name: "+empname);
		out.println("Employee salary");
		double esal= scanner.nextDouble();
		out.println("Employee salary: "+esal);


		while(true) 
		{
			out.println("Do you want to print more records");
			String userinput = scanner.next();


			if(userinput.equals("yes")) {
				out.println("Employee id");
				empid= scanner.nextInt();
				out.println("Employee id: "+empid);

				out.println("Employee name");
				empname=scanner.next();
				out.println("Employee name: "+empname);

				out.println("Employee salary");
				esal= scanner.nextDouble();
				out.println("Employee salary: "+esal);

			}


			else if(userinput.equals("no"))
			{
				out.println("Have a nice day!!!!");
				break;
			}

			else
			{
				out.println("WRONG INPUT!!!!");
				break;
			}

		}
		scanner.close();

	}
}

class SwitchTest
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value: ");
		String option = scanner.next();
		
		switch(option)
		{
		case "Test1":
			System.out.println("Test1 data");
			break;
			
		case "Test2":
			System.out.println("Test2 data");
			break;
		case "Test3":
		case "Test4":
		case "Test5":
			System.out.println("Test3,4,5 data");
			break;
		default:
			System.out.println("What are you doing boy?????");
			break;
		}
		scanner.close();
		
	}
	
}


