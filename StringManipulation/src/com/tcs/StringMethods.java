package com.tcs;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringMethods {

	public static void main(String[] args)
	{
		//conversion of char to string

		char[] test = {'s','a','c','h','i','n'};
		String str = new String(test);
		System.out.println(str);
		
		char[] ch = {'s','a','c','h','i','n'};
		String str1 = new String(ch,2,3);
		System.out.println(str1);
		
		
		byte[] b = {65,66,67,68,69};
		String s5 = new String(b);
		System.out.println(s5);
		
		byte[]b1 = {67,89,34,56};
		String s6 = new String(b1,1,2);
		System.out.println(s6);
		System.out.println("Ratan".equals("ratan"));
		System.out.println("Ratan".equalsIgnoreCase("ratan"));
		System.out.println("Ratan".compareTo("ratan")); // -ve value  R=82 r =114 (R<r)
		System.out.println("Ratan".compareToIgnoreCase("raTaN")); //0
		System.out.println("ratan".compareTo("Ratan")); //+ve vale
		
		String abc = "Test";
		String def ="User";	
		System.out.println(abc.concat(def)); //TestUser
		System.out.println(abc+def); //TestUser
		
		String str10="Ratan";
		System.out.println(str10.charAt(4)); //n
		//System.out.println(str10.charAt(10)); //java.lang.StringIndexOutOfBoundsException
		System.out.println(str10.replace('a', 'A'));
		System.out.println(str10.indexOf('a')); //1
		System.out.println(str10.indexOf('y'));//-1
		System.out.println(str10.lastIndexOf('a'));//3
		
		String s ="hi how are you";
		System.out.println(s.endsWith("you")); //true
		System.out.println(s.startsWith("hi")); //true
		System.out.println(s.contains("are")); //true
		System.out.println(s.startsWith("you")); //false
		
		String[] str8 = s.split(" ");
		for(String ss:str8)
		{
			System.out.println(ss);
		}
		
		String sd ="Hi Mr Sachin";
		System.out.println(sd.toUpperCase());
		System.out.println(sd.toLowerCase());
		System.out.println(sd.replace('S', 'T'));
		
		String s7 = "SachinIT";
		System.out.println(s7.substring(2)); //chinIT
		System.out.println(s7.substring(2,5)); //chi
		
		System.out.println(s7.length());
		
	}

}

class Assignment
{
	public static void main(String[] args) {
		String s1 ="hi mango is good apple is great orange is fruit";
		String[] fruits = s1.split(" ");
		
		for(int i=0;i<fruits.length;i++)
		{
			if(fruits[i].contains("mango")||(fruits[i].contains("apple"))||(fruits[i].contains("orange")))
				{
					System.out.println(fruits[i]);
				}
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name");
		String str90 = scanner.next();
		
		char[] ch = str90.toCharArray();
		for (int i = 0; i < ch.length; i++) {
	
		if((ch[i]=='a')||(ch[i]=='e')||(ch[i]=='i')||(ch[i]=='o')||(ch[i]=='u'))
			{
			System.out.println("vowels are "+ch[i]);
			}

		}
		
		
	}

}

 class Test 
{    public static void main(String[] args) 
    {   int eid=111;
		String ename = "ratan";
		float esal = 10000.455745f;

		System.out.printf("Emp id=%d Emp name=%s Emp sal=%f%n",eid,ename,esal);

		System.out.printf("Emp id=%d Emp name=%s Emp sal=%.2f%n",eid,ename,esal);

		System.out.printf("Emp id=%d Emp name=%s Emp sal=%.3f%n",eid,ename,esal);
		
		System.out.printf("Emp id=%d Emp name=%s Emp sal=%.0f%n",eid,ename,esal);	
	}
}

class DecimalFormatDemo {
	  
	   static public void customFormat(String pattern, double value ) {
	      DecimalFormat myFormatter = new DecimalFormat(pattern);
	      String output = myFormatter.format(value);
	      System.out.println(value + "  " + pattern + "  " + output);
	   }

	   static public void main(String[] args) {
	      customFormat("###,##.###", 123456.789);
	      customFormat("###.##", 123456.789);
	      customFormat("000000.000", 123.78);
	      customFormat("$###,###.###", 12345.67);  
	   }
	}

class JavaFormatter
{
	public static void main(String[] args) 
	{
		int x =100;
		float y = 9.6f;
		String name ="ratan";
		
		System.out.printf("Printing int value: x= %d%n",x);
		System.out.printf("Printing float value with two floor values: y =%.2f%n",y);
		System.out.printf("Print four floor value %.4f%n",y);
		System.out.printf("Print only the celing value: %.0f%n",y); //important
		
		System.out.printf("Print name: %s%n",name);
		
		System.out.printf("Printing all the data: name= %s Salary= %.1f Id=%d", name,y,x);
	
	}
}

class JavaDecimalFormatter
{
	static double num =1235678.4567;
	public static void main(String[] args)
	{
		DecimalFormat decimalFormat = new DecimalFormat("####");
		System.out.println("without fraction part: "+ decimalFormat.format(num));
		
		decimalFormat = new DecimalFormat("###.##");
		System.out.println("Without two fraction: "+decimalFormat.format(num));
		
		decimalFormat = new DecimalFormat("$###,####.##");
		System.out.println("With currency symbol: "+decimalFormat.format(num));
		
		decimalFormat = new DecimalFormat("000000000000.00");
		System.out.println("Adding zeros: "+decimalFormat.format(num));
		
		decimalFormat = new DecimalFormat("#.0000000");
		System.out.println("Adding zeros: "+decimalFormat.format(num));
			
	}
}

class JavaDateFormater
{
	public static void main(String[] args) 
	{
		SimpleDateFormat dt = new SimpleDateFormat("MM-dd-yyyy");
		Date date = new Date();
		System.out.println("Without Format: "+date);
		System.out.println("With Format: "+dt.format(date));
		
		JavaDecimalFormatter jd = new JavaDecimalFormatter();
		System.out.println(jd);
		
	}
}

class ImpMethod   //over riding the toString()
{
	int id;
	String name;
	double salary;
	ImpMethod(int id, String name, double salary)
	{
		this.id =id;
		this.name = name;
		this.salary= salary;
	}
	
	public String toString()
	{

		return "Emp id ="+id+" Emp name "+name+ " Emp salary "+ salary;
	}
	
}

class ImpMethod2
{
	public static void main(String[] args) 
	{
		ImpMethod m1 = new ImpMethod(001,"ratan",788.90);
		System.out.println(m1); // it is same as m1.toString()
		
		String str = "ratan" ;
		System.out.println(str);	
		System.out.println(str.toString());
		
		StringBuffer sb = new StringBuffer("anu");
		System.out.println(sb);			
		System.out.println(sb.toString());
		
	}
}

class Assignment4
{
	String[] addr = {"111","ameerpet","ts"};
	
	public String toString()
	{
		return "id is: "+addr[0]+ " name is: "+ addr[1]+ " job is: "+addr[2];
		
	}
	
	public static void main(String[] args) 
	{
		Assignment4 aa= new Assignment4();
		System.out.println(aa);
		
	}
}

class StringBuilderTest
{
	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("Test");
		StringBuilder sb2 = new StringBuilder("Test");
		System.out.println(sb.equals(sb2)); //false because reference comparison is done 
		
		
		String s1 = new String("Test");
		String s2 = new String("Test");
		System.out.println(s1.equals(s2));// true data comparison is done
		System.out.println(s1==s2); // false
	}
}

class StringTokenizerTest
{
	public static void main(String[] args)
	{
		//method 1
		StringTokenizer st  = new StringTokenizer("hi ratan sir how are you");
		
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
		
		//method 2
		
		String st2 ="hi ratan sir how are you";
		String[] st3= st2.split(" ");
		
		for(String x:st3)
		{
			System.out.println(x);
		}
		Random random = new Random();
		
		System.out.println(random.nextGaussian()); 
		System.out.println(random.nextInt(10000));
		System.out.println(random.nextFloat());
		
		int ran = random.nextInt(6);
		System.out.println(ran);
		
		byte[] b = new byte[10];
		
		random.nextBytes(b);
		
		for(byte bb:b)
		{
			System.out.println(bb);
		}
		
	
		
	}
}
 class ImpMethods
 {
	public static void main(String[] args) 
	{
		System.out.println(Math.min(10, 5));
		System.out.println(Math.max(4.0, 4));
		System.out.println(Math.abs(-11.7));  //11.7
		System.out.println(Math.cbrt(8));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.floor(89.68787)); //89.0
		System.out.println(Math.ceil(89.68787)); //90.0
		System.out.println(Math.rint(8.6));//9.0
		System.out.println(Math.rint(8.2));//8.0
		System.out.println(Math.exp(2));
		System.out.println(Math.pow(2, 3));//8.0
		System.out.println(Math.log(2));
 }
 }
 
 class BasicMathDemo
 {
	 public static void main(String[] args) 
	 {
		 double d =-7876.090;
		 int a=89,b=78;
		 float f = 5.6f;
		 
		 System.out.printf("The absoulute value of %.3f is %.3f%n",d,+Math.abs(d));
		 System.out.printf("The max of %d and %d is %d%n",a, b, Math.max(a, b));
		 System.out.printf("The min of %d and %d is %d%n",a,b,Math.min(a, b));
		 System.out.printf("The floor value of %f is %.0f%n",f,Math.floor(f)); 
		 System.out.printf("The rint value of %f is %.0f%n",f,Math.rint(f));
		 
		 Character c = new Character((char) 65);
		 System.out.println(c);
		 
	 }
 }
