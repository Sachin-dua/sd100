package accessibility;
import static javaclass.Packages.*; //we can access all the static members of the class
import  javaclass.Packages;
public class Package3 {

	public static void main(String[] args) {
		
		Packages p1 = new Packages();
		p1.helloSachin();
	
	    //System.out.println(Packages.b);
	   // b= 15;
	    System.out.println("B has been imported using static import statement "+b);
	    
	}

}
