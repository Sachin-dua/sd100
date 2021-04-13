import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Enumeration {

	enum Week
	{
		MON,TUE,WED;
		
		Week()
		{
			System.out.println("0 arg constructor");
		}
	}
	
	public static void main(String[] args) 
    	{
//		Week w1 = Week.MON;
//		Week w2 = Week.TUE;
//		Week w3 = Week.WED;
//		
//		System.out.println(w1+" "+w2+" "+" "+w3);
//		
		Week[] w= Week.values();
		for(Week ww:w)
		{
			System.out.println(ww+" "+ww.ordinal()); //to check the order of the constants
		}
		
	}
}


enum Week
{
	MON,TUE(10),WED(10,20);
	
	static
	{
		System.out.println("static block");
	}
	{
		System.out.println("instance block");
	}
	
	Week(){
		System.out.println("0 args");
	}
	
	Week(int a)
	{System.out.println("1 args");
		
	}
	
	Week (int z,int y)
	{
		System.out.println("2 args");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		try {
			FileInputStream fis = new FileInputStream("abc.text");
		} catch (FileNotFoundException e) {
			System.out.println("Good");
		}
		System.out.println("welcome");
		
		
	}
	
	
	}

