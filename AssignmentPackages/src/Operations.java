
public class Operations
{
	double rectVolume(double l,double b,double h)
	{
		double volume = l*b*h;
		return volume;
	}
	static String register(String name,String password,int age, String mailId)
	{
		if((name.length()>=4)&&(password.length()>=3)&&(age>=18))
		{
			return "Sucess";
		}
		else
		{
			return "Fail";
		}
	}
	static char studentAvg(int math,int science,int social)
	{
		int average= (math+science+social)/3;
		if(average>80)
		{
			return 'A';
		}
		else if((average>50)&&(average<80))
		{
			return 'B';
		}
		else
		{
			return 'C';
		}
	}
}

class Client
{
	public static void main(String[] args)
	{
		Operations op = new Operations();
		double volume = op.rectVolume(7.1,8.2,9.8);
		System.out.println("The rectangle voume is...."+volume);

		char grade= Operations.studentAvg(100,67,89);
		System.out.println("The final grade is..."+grade);

		String status = Operations.register("Rama","8787ABN",18 ,"ram@gmail.com");
		System.out.println("The status is..."+status);
		byte[] b1 = {65,66,67,68,69};
		String s6 = new String(b1,2,2);
		System.out.println(s6);


	}


}

class Stest
{	public static void main(String[] args)
	{
		String s1 = "ram";
		String s2 = "ratan";
		String s3 = "ram";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);

		String str1 = new String("ram");
		String str2 = new String("ratan");
		String str3 = new String("ram");
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);
		String s4 = "sravya   ";
		System.out.println(s4.substring(2));
		System.out.println(s4.substring(2,4));
		System.out.println(s4.length());
		System.out.println(s4.trim().length());
		System.out.println(s4.trim().substring(2).length());
		String s5 = "07R81A0521";
		System.out.println(s5.startsWith("07R"));

		String s6 = "hi ram sir";
		System.out.println(s6.contains("ram"));
		System.out.println(s6.contains("anu"));

		String s7="hi ram sir";
		String[] s= s7.split("ram");


		for(String ss: s)
		{
			System.out.println(ss);
		}

		String s8 ="hi ratan sir";
		System.out.println(s8.replace('a','A'));
		System.out.println(s8.replace("ratan","naresh"));
		System.out.println(s8.replace("anu","ramu"));
		System.out.println(s8.replace(" ",""));

		String m = "durga";
		System.out.println(m.charAt(2)); //string also have this method
		char[]ch = m.toCharArray();

		System.out.println(ch[2]);
		System.out.println(ch.length);

		for(char ch1:ch)
		{
			System.out.println(ch1);
		}


	}
}
