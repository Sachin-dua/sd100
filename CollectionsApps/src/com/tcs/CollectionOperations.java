package com.tcs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionOperations
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("test");
		al.add("sachin");
		al.add("himani");
		al.add("ratan");
		System.out.println("Before sorting "+al);
		Collections.sort(al);
		System.out.println("After sorting "+al);
		
		// Scenario: we can not sort a list with different type of data type elements
		try 
		{
		ArrayList al2 = new ArrayList();
		al2.add("test");
		al2.add("sachin");
		al2.add("himani");
		al2.add("ratan");
		al2.add(10);
		
		Collections.sort(al2);
		System.out.println(al2); 
		}
		
		catch(ClassCastException e)
		{
			System.out.println("Class Cast Exception!!!!!!!!!!");
		}
		// Scenario: we can not sort a list with null value
		try 
		{
		ArrayList al3 = new ArrayList();
		al3.add("test");
		al3.add("sachin");
		al3.add("himani");
		al3.add(null);
		
		
		Collections.sort(al3);
		System.out.println(al3); 
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception!!!!!!!!!!");
		}
		

	}

}
//---------------------------------------------------------------------------------------------------------------------------//
//sorting of int data using normal class


class Employee implements Comparable
{
	int eid;
	String ename;
	double salary;
	public Employee(int eid, String ename, double salary) 
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		if(eid>e.eid)
		{
			System.out.println(e.eid);
			return 1;
		}
		
		else if(eid==e.eid)
		{
			return 0;
		}
		
		else
		{
			return -1;
		}
	}
	
}


class Sorting 
{
	public static void main(String[] args) 
	{
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(12,"ratan",678.98));
		l.add(new Employee(32,"anu",578.98));
		l.add(new Employee(8,"sachin",878.8));
		
		Collections.sort(l);
		for(Employee tt: l)
		{
			System.out.println(tt.eid+" "+tt.ename+" "+tt.salary);
		}
		
	}
}
//---------------------------------------------------------------------------------------------------------------------------//
// sorting of String data using generic class

class StudentTest implements Comparable<StudentTest>  //used the generic class
{
	int sid;
	String name;
	
	StudentTest(int sid,String name){
		this.sid = sid;
		this.name= name;
	}
	
	public int compareTo(StudentTest s)  // no need to type cast
	{
		return name.compareTo(s.name);
		
	}
}

class Teacher 
{
	public static void main(String[] args) 
	{
		ArrayList<StudentTest> li = new ArrayList<StudentTest>();
		li.add(new StudentTest(45,"zebra"));
		li.add(new StudentTest(78,"uma"));
		
		Collections.sort(li);
		
		for(StudentTest s:li)
		{
			System.out.println(s.sid+" "+s.name);
		}
		
	}
}
//---------------------------------------------------------------------------------------------------------------------------//
//sorting of Wrapper class data using generic class

class ClientTest implements Comparable<ClientTest>  //used the generic class
{
	Integer sid;
	String name;
	
	ClientTest(int sid,String name){
		this.sid = sid;
		this.name= name;
	}
	
	public int compareTo(ClientTest s)  // no need to type cast
	{
		return -sid.compareTo(s.sid); //use -ve sign for the descending order 
		
	}
}

class TCSTest 
{
	public static void main(String[] args) 
	{
		ArrayList<ClientTest> li = new ArrayList<ClientTest>();
		li.add(new ClientTest(45,"zebra"));
		li.add(new ClientTest(78,"uma"));
		
		Collections.sort(li);
		
		for(ClientTest s:li)
		{
			System.out.println(s.sid+" "+s.name);
		}
		
	}
}
//---------------------------------------------------------------------------------------------------------------------------//
// Approach taking the sorting logics to separate class apply the class here
class CSE implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2) 
	{
		if(e1.eid>e2.eid)
		{
		return 1;
		}
		
		if(e1.eid==e2.eid)
		{
		return 0;
		}
		
		else
		{
			return -1;
		}
		
	}
	
}

class CSE2 implements Comparator<Emp>
{

	@Override
	public int compare(Emp e1, Emp e2) 
	{
		return (e1.ename).compareTo(e2.ename);
	}
	
}
class ME 
{
	public static void main(String[] args) 
	{
		ArrayList<Emp> al=  new ArrayList<Emp>();
		al.add(new Emp(31,"himani"));
		al.add(new Emp(11,"sachin"));
		
		Collections.sort(al,new CSE());
		
		for(Emp ee:al)
		{
			System.out.println(ee.eid+" "+ee.ename);
		}
		System.out.println("**********************************");
		Collections.sort(al,new CSE2());
		
		for(Emp s:al)
		{
			System.out.println(s.eid+" "+s.ename);
		}
	
	}
}
//---------------------------------------------------------------------------------------------------------------------------//
//Approach taking the sorting logics to same class
// We don't need to create a separate class 
class YS  
{
	
	public static void main(String[] args) 
	{
		ArrayList<Emp> al=  new ArrayList<Emp>();
		al.add(new Emp(31,"sachin"));
		al.add(new Emp(11,"himani"));
		
		Collections.sort(al,new Comparator<Emp>()
						{
							public int compare(Emp e1, Emp e2)
							{
								return e1.ename.compareTo(e2.ename);
							}
			
						});
		
		for(Emp w:al)
		{
			System.out.println(w.eid+" "+w.ename);
		}
	}

}

//---------------------------------------------------------------------------------------------------------------------------//
// we can also use the arraylist sort method
class BGS  
{
	
	public static void main(String[] args) 
	{
		ArrayList<Emp> al=  new ArrayList<Emp>();
		al.add(new Emp(31,"sachin"));
		al.add(new Emp(11,"himani"));
		
		al.sort(new Comparator<Emp>()
						{
							public int compare(Emp e1, Emp e2)
							{
								return e1.ename.compareTo(e2.ename);
							}
			
						});

		for(Emp w:al)
		{
			System.out.println(w.eid+" "+w.ename);
		}
		
	}

}
//---------------------------------------------------------------------------------------------------------------------------//
//sorting using lambda expression
class SunFlower  
{
	
	public static void main(String[] args) 
	{
		ArrayList<Emp> al=  new ArrayList<Emp>();
		al.add(new Emp(31,"sachin"));
		al.add(new Emp(11,"himani"));
		
		al.sort((e1,e2)->e1.eid.compareTo(e2.eid));
		for(Emp w:al)
		{
			System.out.println(w.eid+" "+w.ename);
		}
		
	}

}
//---------------------------------------------------------------------------------------------------------------------------//
//sorting assignments (descending order) of bookId using generic version

class AwBook
{
	Integer bookId;
	String name;
	String author;
	
	public AwBook(Integer bookId, String name, String author) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
	}
}

class BookTest implements Comparator<AwBook>
{
	@Override
	public int compare(AwBook b1, AwBook b2) 
	{
		
		return -b1.bookId.compareTo(b2.bookId);
	}

}

class Assignment1
{
	public static void main(String[] args) {
		ArrayList<AwBook> al = new ArrayList<AwBook>();
		al.add(new AwBook(23,"eat that frog","Brain Tracy"));
		al.add(new AwBook(7,"revolution 2020","Chetan Bhagat"));
		Collections.sort(al, new BookTest());
		
		for(AwBook bb: al)
		{
			System.out.println(bb.bookId+" "+bb.name+" "+bb.author);
		}
		
	}
	
}

//---------------------------------------------------------------------------------------------------------------------------//
//sorting assignments (descending order) of book name using generic version

class BookTest2 implements Comparator<AwBook>
{
	@Override
	public int compare(AwBook b1, AwBook b2) 
	{
		
		return b2.name.compareTo(b1.name);
	}

}

class Assignment2
{
	public static void main(String[] args) 
	{
		ArrayList<AwBook> al = new ArrayList<AwBook>();
		al.add(new AwBook(23,"eat that frog","Brain Tracy"));
		al.add(new AwBook(7,"revolution 2020","Chetan Bhagat"));
		Collections.sort(al, new BookTest2());
		
		for(AwBook j:al)
		{
			System.out.println(j.bookId+" "+j.name+" "+j.author);
		}
	}
	
}
//---------------------------------------------------------------------------------------------------------------------------//
// directly doing sorting using lambda

class PCCustomer
{
	Integer id;
	String name;
	String address;
	
	public PCCustomer(Integer id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
}

class CCTest implements Comparator<PCCustomer>
{
	@Override
	public int compare(PCCustomer p1, PCCustomer p2)
	{
		return -p1.id.compareTo(p2.id);
	}
}

class ActualTest
{
	public static void main(String[] args) 
	{
		ArrayList<PCCustomer> p1 = new ArrayList<PCCustomer>();
		p1.add(new PCCustomer(34,"sadad","sadasdsds"));
		p1.add(new PCCustomer(89,"fdss","dfghgfhsds"));
		p1.add(new PCCustomer(6,"hjyy","tbhf"));
		p1.add(new PCCustomer(9,"gfg","muyj"));
		
		Collections.sort(p1,new CCTest());
		
		for (PCCustomer pcCustomer : p1) 
		{
			System.out.println(pcCustomer.id+" "+pcCustomer.name+" "+pcCustomer.address);
		}
		
	}
		
		
}
//---------------------------------------------------------------------------------------------------------------------------//
//directly doing sorting in the same class (anonymous class)

class ActualTest2
{
	public static void main(String[] args) 
	{
		ArrayList<PCCustomer> p1 = new ArrayList<PCCustomer>();
		p1.add(new PCCustomer(34,"sadad","sadasdsds"));
		p1.add(new PCCustomer(89,"fdss","dfghgfhsds"));
		p1.add(new PCCustomer(6,"hjyy","tbhf"));
		p1.add(new PCCustomer(9,"gfg","muyj"));
		
		p1.sort(new Comparator<PCCustomer>()
					{
					public int compare(PCCustomer c1,PCCustomer c2)
					{
						return c1.name.compareTo(c2.name);
					}
	
		
					});
		
		for (PCCustomer pcCustomer : p1) 
		{
			System.out.println(pcCustomer.id+" "+pcCustomer.name+" "+pcCustomer.address);
		}
		
		
		System.out.println();
		System.out.println("**********************Lambda expresiion************************");
		
		//p1.sort((PCCustomer c1, PCCustomer c2)->-(c1.id).compareTo(c2.id));
		p1.sort((c1, c2)->  (c1.id).compareTo(c2.id));
		
		for (PCCustomer pcCustomer2 : p1) 
		{
			System.out.println(pcCustomer2.id+" "+pcCustomer2.name+" "+pcCustomer2.address);
		}
		
		
	
		
	}
	

		
		
}














