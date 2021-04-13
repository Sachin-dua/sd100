import java.awt.Frame;
import java.util.ArrayList;
import java.util.List;

public class Annottaion {


	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add("ratan");
		System.out.println(al);
		
		
		Frame f = new Frame();
		f.show();

	}

}
@Deprecated
class Test
{
	
	void course()
	{
		System.out.println("Core java classes");
	}
	
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.course();
	}
}

@FunctionalInterface
interface Message
{
	void wish();  // if there is only one abstract method it is known as functional interface otherwise normal interface
	void disp();
	
}

class Varargs
{
	void add(int... x)
	{
		int sum=0;
		for(int x1:x)
		{
			sum = sum+x1;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) 
	{
		Varargs v = new Varargs();
		v.add();
		v.add(19,89);
		v.add(67,7,56);
	}
}

class Child extends Varargs
{
	@SafeVarargs
	private final void disp(List<String>... names)
	{
		for(List<String> name:names)
		{
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		List<String> students = new ArrayList<>();
		students.add("manu");
		students.add("ratan");
		c.disp(students);
	}
	
}





