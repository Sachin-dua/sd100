//-------------------------------------------------------------------------------------------------------------------------------------//
//To print an Array
public class Test
{
	public static void main(String[] args) 
	{
		int a[] = {1,56,78,90};
		
		//method 1
		
		for(int i=0;i<a.length;i++)  //using for loop
		{
			System.out.println(a[i]);
		}
		
		//method 2
		for(int n:a)   //using for-each
		{
			System.out.println(n);
		}
	}
}

//-------------------------------------------------------------------------------------------------------------------------------------//
//Array with default values int default value is 0
 class Test2
{
	public static void main(String[] args) 
	{
		int a[] = new int[10];
		 a[0] = 10;
		  a[2] =11;
		
		//method 1
		
		for(int i=0;i<a.length;i++)  //using for loop
		{
			System.out.println(a[i]);
		}
		
		//method 2
		for(int n:a)   //using for-each
		{
			System.out.println(n);
		}
	}
}
 
//-------------------------------------------------------------------------------------------------------------------------------------//
//Array with default values String default value is null
class Test3
{
	public static void main(String[] args) 
	{
		String a[] = new String[5];
		 a[0] = "Ram";
		  a[2] ="Ratan";
		
		//method 1
		
		for(int i=0;i<a.length;i++)  //using for loop
		{
			System.out.println(a[i]);
		}
		
		//method 2
		for(String n:a)   //using for-each
		{
			System.out.println(n);
		}
	}
}

//-------------------------------------------------------------------------------------------------------------------------------------//
//How to find out the empty indexes  
class Test4
{
	public static void main(String[] args) 
	{
		String a[] = new String[5];
		 a[0] = "Ram";
		 a[2] ="Ratan";
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i]==null)
			 {
				 System.out.println(i);
			 }
		 }
			
	}
}

//-------------------------------------------------------------------------------------------------------------------------------------//
//User defined array and storing employee data into each index
class Test5
{
	int eid;
	String ename;
	double esal;
	
	public Test5(int eid, String ename, double esal) 
	{
		this.eid =eid;
		this.ename=ename;
		this.esal=esal;
	}
	 
}

class Test6
{
	public static void main(String[] args) 
	{
		Test5 tt1 = new Test5(34,"ram",87877.99);
		Test5 tt2= new Test5(45,"sham",989898);
		Test5 tt3 = new Test5(88,"ratan",767867.87);
		
		Test5[] t = new Test5[3];
		t[0]=tt1;
		t[1]=tt2;
		t[2]=tt3;
		
		for (Test5 test5 : t) 
		{
			System.out.println(test5.eid+" "+test5.ename+" "+test5.esal);
		}
		
	}	
}
//-------------------------------------------------------------------------------------------------------------------------------------//
// Null pointer exception because e[1] is null and we are trying to get the city

class Test7
{
	int eid;
	String name;
	double salary;
	String city;
	
	public Test7(int eid, String name, double salary, String city) 
	{
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}
	
}

class Emp
{
	public static void main(String[] args) {
		
	
	Test7 t7 = new Test7(45,"Steve",567756,"Moga");
	//Test7 t77 = new Test7(46,"Tom",787,"Barnala");
	//Test7 t777 = new Test7(47,"Raju",8787,"Vancouver");
	Test7 t7777 = new Test7(48,"Santa",56877756,"Brisbane");
	

	Test7[] e = new Test7[4];
	e[0]=t7;
	//e[1]=t77;
//	e[2]=t777;
	e[3]=t7777;
	
	for (Test7 test7 : e) 
	{
		System.out.println(test7.eid+" "+test7.name+" "+test7.salary+" "+test7.city);
	}

	}
	
}
//-------------------------------------------------------------------------------------------------------------------------------------//
//How to overcome the null pointer exception

class Test8 
{
	int eid;
	String city;
	public Test8(int eid, String city) 
	{
		this.eid=eid;
		this.city=city;
	}
}

class TCS
{
	public static void main(String[] args)
	{
		Test8 tt1 = new Test8(23,"Barnala");
		Test8 tt3= new Test8(45,"Patiala");
		
		Test8[] test8 = new Test8[3];
		test8[0]= tt1;
		test8[2]=tt3;
		
		for (Test8 t : test8) 
		{
			if(t==null)
			{
				System.out.println(t);
			}
			else
			{
			System.out.println(t.eid+" "+t.city);
			}
		}
		
	}
}

//-------------------------------------------------------------------------------------------------------------------------------------//
//To print 2-D array
class Ubisoft
{
	public static void main(String[] args) 
	{
		int a[][] = new int[2][2];
		a[0][0]= 5;
		a[0][1]=8;
		a[1][0]=90;
		a[1][1]=87;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}		
	}
}
//-------------------------------------------------------------------------------------------------------------------------------------//

class ThreeD
{
	public static void main(String[] args) 
	{
		int a[][][] = new int[2][2][2];
		a[0][0][0]=6;
		a[0][0][1]=9;
		a[0][1][0]=15;
		a[0][1][1]=19;
		a[1][0][0]=21;
		a[1][0][1]=22;
		a[1][1][0]=90;
		a[1][1][1]=77;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}

//-------------------------------------------------------------------------------------------------------------------------------------//
// Jagged Array

class Jagged
{
	public static void main(String[] args) 
	{
		int arr[][]= new int[3][];
		arr[0]= new int[3]; // first row contains 3 elements
		arr[1]= new int[1]; // second row contains 1 elements
		arr[2]= new int[5]; // third row contains 5 elements
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]= i+j;
				System.out.print(arr[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
	}
}

//-------------------------------------------------------------------------------------------------------------------------------------//
// To get the sum of the elements in the array
// TO get the minimum element from the array
// To get the maximum element from the array


class ArrayTest
{
	public static void main(String[] args) {
	int a[] = {10,20,30,40,50};
	int sum=0;
	for(int i=0;i<a.length;i++)
	{
		sum =sum+a[i];
	}
	System.out.println(sum);
	
	//--------------------------------------------//
	int max = a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max= a[i];
		}
	}
	System.out.println(max);
	
	int min = a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println(min);
	}
	
}

//------------------------------------------------------------------------------------------------------------------------------------------//

class Emp4
{
	int eid;
	String ename;
	double salary;
	
	
	Emp4(int eid,String ename,double salary)
	{
		this.eid = eid;
		this.ename=ename;
		this.salary=salary;
	}
}

class MainTest
{
	public static void main(String[] args) 
	{
		Object[] ob = new Object[3];
		ob[0]= new Emp4(111,"ratan",888.90);
		ob[1]=new Integer(10);
		ob[2]="dsads";
		
		for (Object ob1 : ob) 
		{
			if(ob1 instanceof Emp )
			{
				Emp4 ep = (Emp4) ob1;
				System.out.println(ep.eid+" "+ep.ename+" "+ep.salary );
			}
			
			if(ob1 instanceof Integer )
			{
				
				//System.out.println(ob);
			}
			
		}
		//ob=null;
		
	}
}


