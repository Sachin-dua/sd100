package javaclass;

public class TestClient {

	public static void main(String[] args) {
		LaptopInfo l1 = new LaptopInfo();
		l1.hpinfo();
		l1.lenovoinfo();
		System.out.println("The minimum price for the laptop is "+l1.minprice);
		MobileInfo.Appleinfo();
		MobileInfo.Vivoinfo();
		System.out.println("The minimum price for the mobile is "+MobileInfo.minprice);

	}

}

class B{
	public static void main(String[] args) {
		System.out.println("Hello");
	}
}


