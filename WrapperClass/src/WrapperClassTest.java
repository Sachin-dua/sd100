import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class WrapperClassTest {

	public static void main(String[] args)  
	{
		// constructor approach
		Integer i1= new Integer("10");
		Integer i2=  new Integer(10);
		System.out.println(i1+i2);
		
		// valueOf (static method)
		Integer x1 = Integer.valueOf("90");
		Integer x2 =Integer.valueOf(10);
		System.out.println(x1+x2);
		
		//conversion of wrapper object to primitive data (xxxValue)
		Integer t1 = Integer.valueOf("56");
		int y = t1.intValue();
		float z = t1.floatValue();
		System.out.println(y+z);
		
		//conversion of wrapper object to String (toString)
		Integer xyz = Integer.valueOf(23);
		String data = xyz.toString();
		System.out.println(data);
		
		//Auto boxing: Automatic conversion of primitive data to wrapper object
		Integer x = 100;
		System.out.println(x);
		
		//Auto unboxing: Automatic conversion of wrapper to primitive
		int k = new Integer(100);
		System.out.println(k);
		
		Integer c = new Integer("100");
		Integer c2 = new Integer("100");
		System.out.println(c==c2);  //false
		System.out.println(c.equals(c2));//true
		
		Integer g1= Integer.valueOf(127);
		Integer g2 = Integer.valueOf(127);
		System.out.println(g1==g2); //true
		System.out.println(g1.equals(g2)); //true
		
		//a new object is create when the value reaches out of the limit of -128 to 128
		Integer h1= Integer.valueOf(129);
		Integer h2 = Integer.valueOf(129);
		System.out.println(h1==h2); //false
		System.out.println(h1.equals(h2)); //true
		
		String s1 ="100";
		String s2="100";
		System.out.println(s1+s2);
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println(a+b);
		
	}

}

class Test
{
	void disp(Number n)  //Number is the super class of int,float,double,short,byte,long
	{
		System.out.println(n);
	}
	
	public static void main(String[] args) throws ParseException {
		Test t = new Test();
		t.disp(10);
		t.disp(10.5);
		t.disp(11.9f);
		
		t.disp(new Integer(10));
		t.disp(new Float(10.5f));
		
		String s1 = "100";
		int y = Integer.valueOf(s1);
		int z =200;
		System.out.println(y+z);
		
		String dateToday ="04/01/2021";
		Date date = new SimpleDateFormat("MM/dd/yyyy").parse(dateToday);
		System.out.println(date);
		
	}
}

 class HashMapEx1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> h = new HashMap<Integer,String>(); 
		h.put(111, "ratan");
		System.out.println(h.keySet());
	}
}
