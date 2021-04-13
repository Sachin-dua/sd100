package javaclass;

public class Product {
	int pid;
	String pname;
	double pcost;
	int quantity;
	public static final String storeName="D-Mart";
	public static final String address="Hyderabad";
	double totalBill;
	
	Product(int pid,String pname,double pcost, int quantity){
		this.pid=pid;
		this.pname=pname;
		this.pcost=pcost;
		this.quantity=quantity;
		
	}
	
	double calculateBill() {
		totalBill=pcost*quantity;
		return totalBill;
	}
	
	void disp() {
		if(totalBill>1000) {
			System.out.println("Good Customer");
			System.out.println(pid+" "+pname+" "+pcost+" "+quantity+" "+Product.storeName+" "+Product.address);
		}
		
		else {
			System.out.println("Very Good Customer");
			System.out.println(pid+" "+pname+" "+pcost+" "+quantity);

		}
	}
	
	public static void main(String[] args) {
		Product mobile = new Product(1,"Samsung",600.78,1);
		Product mobile2 = new Product(2,"Apple",789.71,3);
		Product mobile3 = new Product(3,"Google",600.88,6);
		double totalAmount= mobile.calculateBill();
	    System.out.println(totalAmount);
		double totalAmountM2=mobile2.calculateBill();
		System.out.println(totalAmountM2);
		double totalAmountM3=mobile3.calculateBill();
		System.out.println(totalAmountM3);
		mobile.disp();
		mobile2.disp();
		mobile3.disp();
		
	}

}
