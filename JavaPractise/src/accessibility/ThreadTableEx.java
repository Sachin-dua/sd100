package accessibility;

public class ThreadTableEx extends Thread
{
	int num;
	public ThreadTableEx(int num)
	{
		this.num=num;
	}
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getPriority());
		for (int i = 1; i <= 10; i++)
		{
			int table = num*i;
			System.out.println(table);

		}

	}

	public static void main(String[] args)
	{
		ThreadTableEx t1 = new ThreadTableEx(5);
		ThreadTableEx t2 = new ThreadTableEx(8);

		t1.setPriority(1);
		t2.setPriority(Thread.MAX_PRIORITY);

		t1.start();
		t2.start();
	//	t1.interrupt();
	}
}

class Synchronized
{
	public synchronized static void status(String name)
	{
		System.out.println("Status is.."+name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class MyThread1 extends Thread
{
	@Override
	public void run()
	{
		Synchronized.status("java");
	}

}

class MyThreadTwo extends Thread
{
	@Override
	public void run()
	{
		Synchronized.status("test");
	}
}

class MyThread3 extends Thread
{
	@Override
	public void run()
	{
		Synchronized.status("Passed");
	}

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThreadTwo t2=	new MyThreadTwo();
		MyThread3 t3=	new MyThread3();
		t1.start();
		t2.start();
		t3.start();
	}
}











