package com.tcs.client;

//import com.tcs.info.A;
//import com.tcs.client.A;

public class TestClient {

	public static void main(String[] args) {
		com.tcs.info.A a = new com.tcs.info.A();
		com.tcs.services.A b = new com.tcs.services.A();
		a.wish();
		System.out.println(b.add(3, 8));
		
		//com.tcs.client.A a1 =new com.tcs.client.A();
		//a1.add(5,4);
		
		
		

	}

}
