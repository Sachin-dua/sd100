package accessibility;

	public class MyThread extends Thread
	{
		@Override

		public void run()
		{
	        for (int i = 0; i < 3; i++)
	        {
	        	System.out.println("User defined Thread..."+Thread.currentThread().getName());

			}
		}

		public static void main(String[] args)
		{
			MyThread t = new MyThread();
			MyThread2 t2 = new MyThread2();
			System.out.println(MyThread.currentThread().getName());
			MyThread.currentThread().setName("Main method changed");
			System.out.println(MyThread.currentThread().getName());
			t.setName("JavaTestThread");
			System.out.println(t.getName());
			t.start();

			for (int i = 0; i < 10; i++)
			{
				System.out.println("Main Thread");
			}

		}

}

	class MyThread2 extends Thread
	{
		@Override
		public void run()
		{
			System.out.println("User defined Thread2");
		}
	}

	class HookThread extends Thread
	{
		@Override
		public void run()
		{
			for (int i = 0; i < 3; i++)
			{
			System.out.println("Good Morning");
			}
		}


		public static void main(String[] args)
		{
			HookThread myThread1 = new HookThread();
			Runtime runtime = Runtime.getRuntime();
			runtime.addShutdownHook(myThread1);
			for (int i = 0; i < 10; i++)
			{
				System.out.println("Main Thread");

				if(i==4)System.exit(0);
			}

		}
	}

	class MyThreadEx3 extends Thread
	{
	public static void main(String[] args) throws InterruptedException
		{
			MyThread t1 = new MyThread();
			MyThread t2 = new MyThread();
			MyThread t3 = new MyThread();
			t1.start();
			t1.join();
			t2.start();
		 	t2.join();
			t3.start();
			t3.join();
		}

	}
