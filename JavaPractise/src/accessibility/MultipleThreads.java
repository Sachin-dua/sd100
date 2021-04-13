package accessibility;

public class MultipleThreads extends Thread
{
	@Override
	public void run()
	{
		for (int i = 0; i < 3; i++)
		{
			System.out.println("Good morning..."+Thread.currentThread().getName());
			if(i==1)
				System.exit(0);
		}

	}


	public static void main(String[] args) throws InterruptedException
	{
		MultipleThreads t1 = new MultipleThreads();
		Thread2 t2 = new Thread2();
		Thread  t3 = new Thread3();

		Runtime runtime = Runtime.getRuntime();
	//	runtime.addShutdownHook(t1);
		runtime.addShutdownHook(t2);
		runtime.addShutdownHook(t3);

		t1.setName("Java Thread1");
		t2.setName("Java Thread2");
		t3.setName("Java Thread3");

		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();

	}

}


class Thread2 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Good evening..."+Thread.currentThread().getName());
	}
}

class Thread3 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Good night..."+Thread.currentThread().getName());
	}
}