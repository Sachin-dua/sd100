package com.fileIO.examples;

class MyThread extends Thread
{
  @Override
public void run() {
	for(int i=0;i<10;i++)
	{
		System.out.println("user defined thread");
	}
}
}
public class ThreadDemo1{
  public static void main(String[] args) {
	MyThread t = new MyThread();
	t.start();
	// it will first check the start method in MyThreadClass but start method is no there and then look for parent class then parent class method executed
	// it will registered thread into thread schedular it automallically call run method

	for(int i=0;i<10;i++)
	{
		System.out.println("main thread");
	}

}
}
