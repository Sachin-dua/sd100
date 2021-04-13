package com.fileIO.examples;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AssignmentFileHandling {

	public static void main(String[] args) {
		File f1 = new File("C:\\sachin");
		boolean fileExists = f1.exists();
		System.out.println(fileExists);
		f1.mkdir();
		FileWriter fwd = null;
		try {
			File f2 = new File(f1,"a1.txt");
			f2.createNewFile();
			fwd = new FileWriter(f2);
			fwd.write("Hello");

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fwd.close();
		} catch (IOException e) {

			e.printStackTrace();
		}


	}

}

class ReadAndWrite {

	public static void main(String[] args) {
		FileReader frd = null;
		FileWriter fwd = null;
		FileWriter fwd2 = null;
		FileWriter fwd3 = null;
		FileReader frd1 = null;
		FileReader frd2 = null;

		try {
			File file = new File("xyz.txt");
			frd = new FileReader(file);
			frd1 = new FileReader("test.txt");
			frd2 = new FileReader("test.txt");
			fwd = new FileWriter("file1.txt");
			fwd2 = new FileWriter("file3.txt");
			fwd3 = new FileWriter("file4.txt");

			int count = 0;

			while (count <= 26) {
				int c = frd.read();
				fwd.write(c);
				count++;
				if(count ==2)
				{
				break;
				}

			}



			while (count != 12) {
				int c = frd1.read();
				fwd2.write(c);
				count++;

			}

			while (count != 26) {
				int c = frd2.read();
				fwd3.write(c);
				count++;

			}

		}

		catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {

				frd.close();
				fwd.close();
				fwd2.close();
				fwd3.close();
				System.out.println("Operation completed");

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
