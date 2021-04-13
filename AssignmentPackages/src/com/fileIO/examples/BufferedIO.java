package com.fileIO.examples;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedIO {

	public static void main(String[] args) throws IOException
	{
		File file = new File("test");
		file.mkdir();

		File f2 = new File(file,"sita.txt");
		f2.createNewFile();

		try(BufferedReader reader = new BufferedReader(new FileReader(f2));
				BufferedReader reader2 = new BufferedReader(new FileReader(f2));
				BufferedReader reader3 = new BufferedReader(new FileReader(f2));

				BufferedWriter writer = new BufferedWriter(new FileWriter("jadeja.txt"));
				BufferedWriter writer2 = new BufferedWriter(new FileWriter("pandya.txt"));
				BufferedWriter writer3 = new BufferedWriter(new FileWriter("kohli.txt")))
		{

			String line;

			int count=0;

			while((line=reader.readLine())!=null)
			{

				writer.write(line);
				count++;
				if(count==1)
					break;
			}

			while((line=reader2.readLine())!=null)
			{
                count=0;
				writer2.write(line);
				count++;

				if(count==2)
				{
					break;
				}

			}
			while((line=reader3.readLine())!=null)
			{
				count=0;
				writer3.write(line);
				count++;
				if(count==3)
				{
					break;
				}
			}
		}

		catch(IOException e)
		{
			System.err.println();
		}

		System.out.println("Operation completed");
	}

}

class Images
{
	public static void main(String[] args) throws IOException {
//		File file = new File("images");
//		file.mkdir();
//
//		File file2 = new File(file,"image1.jpg");
//		file2.createNewFile();

		try(BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream("C:\\Users\\sachin.dua\\eclipse-workspace\\AssignmentPackages\\images\\mountain.jpg"));
				BufferedOutputStream outputStrm = new BufferedOutputStream(new FileOutputStream("C:\\\\Users\\\\sachin.dua\\\\eclipse-workspace\\\\AssignmentPackages\\\\images\\\\mountaincopy.jpg")))

		{
			int n;

			while((n= inputStream.read())!=-1)
			{
				outputStrm.write(n);
			}
		}
		System.out.println("Operation done");

	}
}

