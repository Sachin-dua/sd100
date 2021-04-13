package com.fileIO.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOOperations 
{

	public static void main(String[] args) 
	{
		FileReader frd=null; 
		FileWriter fwd=null; 

		try {

			frd= new FileReader("xyz.txt");
			fwd= new FileWriter("lmn.txt");

			int c;
			while((c=frd.read())!=-1)
			{
				fwd.write(c);
				//System.out.println(10/0);
			}
		}

		catch(IOException e)
		{
			e.printStackTrace();
		}

		finally
		{
			try
			{
				frd.close(); 
				fwd.close();
				System.out.println("Operation completed");
			}

			catch(IOException e)
			{
				e.printStackTrace();
			}


		}
	}

}

class ImageReader
{
	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		FileOutputStream fos= null;
		try 
		{
			fis = new FileInputStream("mountain.jpg");
			//System.out.println(10/0);
			fos = new FileOutputStream("klm.jpg");

			int c = fis.read();
			while(c!=-1)
			{
				fos.write(c);
			}

		}
		catch(IOException e)
		{
			System.out.println("Handled");
		}

		finally
		{
			try
			{
				if(fis!=null)  // it means resources are open; if fis == null it means resource was not open 
				{
					fis.close();
				}
				if(fos!=null)
				{
					fos.close();
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Operations are completed");
	}
}

class AppendLine
{
	
	
		public static void main(String[] args)
		{
			FileReader fr = null;
			FileWriter fw= null;
	
			try
			{
				fr = new FileReader("abc.txt");
				fw= new FileWriter("abc.txt",true); //Pass true as a second argument to FileWriter to turn on "append" mode.
	
				int c = fr.read();
	
				if(c!=-1)
				{
		            fw.write("\n");  //adding a new line
					fw.append("Hi Ram sir");
					
				}
	
			}
			catch(IOException e)
			{
				System.out.println("Exception handled");
			}
	
			finally
			{
				try
				{
					if(fr!=null)
					{
					fr.close();
					}
					if(fw!=null)
					{
					fw.close();
					}
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
			System.out.println("Operation is completed");
	
		}
}
	
//
//	public static void main(String[] args)
//	{
//		FileReader fr = null;
//		FileWriter fw= null;
//
//		try
//		{
//			fr = new FileReader("abc.txt");
//			fw= new FileWriter("abc.txt",true); //Pass true as a second argument to FileWriter to turn on "append" mode.
//
//			int c = fr.read();
//
//			if(c!=-1)
//			{
//	            fw.write("\n");  //adding a new line
//				fw.append("Hi Ram sir");
//				
//			}
//
//		}
//		catch(IOException e)
//		{
//			System.out.println("Exception handled");
//		}
//
//		finally
//		{
//			try
//			{
//				if(fr!=null)
//				{
//				fr.close();
//				}
//				if(fw!=null)
//				{
//				fw.close();
//				}
//			} 
//			catch (IOException e) 
//			{
//				e.printStackTrace();
//			}
//		}
//		System.out.println("Operation is completed");
//
//	}
//}



