import java.util.Scanner;

public class StringManipulation
{
	String name;
	public static void main(String[] args)
	{
		
		String s ="hi mango is good apple is great orange is a fruit";
		
		s= s.replaceAll("mango", "MANGO");
		s= s.replaceAll("apple", "APPLE");
		s= s.replaceAll("orange", "ORANGE");
		
		System.out.println(s);
		
		String s2= "today class is completed";
		
		
		
		String[]s3= s2.split(" ");
		
		s3[0]= s3[0].toUpperCase();
		System.out.println(s3[0]);
		
		System.out.println(s3[0].length());
		
		s3[1]= s3[1].toUpperCase();
		System.out.println(s3[1]);
		System.out.println(s3[1].length());
		
		s3[2]= s3[2].toUpperCase();
		System.out.println(s3[2]);
		System.out.println(s3[2].length());
		
		s3[3]= s3[3].toUpperCase();
		System.out.println(s3[3]);
		System.out.println(s3[3].length());
		
		StringManipulation st= new StringManipulation();
		//st.vowelsOrConsonant();
		st.stringBuffer();
		
		
	}
	
	public void vowelsOrConsonant()
	{
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name..");
		
		String name = scanner.next();
		name=name.toLowerCase();
		
		for(int i =0;i<name.length();i++)
		{
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u')
			{
				System.out.println("Vowels: "+name.charAt(i));
			}
			
			
			else
			{
				System.out.println("Consonents: "+name.charAt(i));
			}

		}
	
	
		scanner.close();	
		
	
	}
	
	public void stringBuffer()
	{
		StringBuffer sb1= new StringBuffer("ratanit is great");
		//System.out.println(sb1.deleteCharAt(2));
		//System.out.println(sb1.reverse());
		//stem.out.println(sb1.append("Test"));
		//System.out.println(sb1.insert(0, "Hi"));
		System.out.println(sb1.replace(11, 16, "Hi"));
		
		String sb2= new String("ratanit");
		
		//System.out.println(sb2.deleteCharAt(2)); The method deleteCharAt(int) is undefined for the type String
	}
}
