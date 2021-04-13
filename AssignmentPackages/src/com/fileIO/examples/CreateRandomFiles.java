package com.fileIO.examples;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class CreateRandomFiles {

	public static void main(String[] args) throws IOException {
		File file = new File("ram");
		file.mkdir();

		String alphabet ="abcdefghijkl";
		String name ="";
		String name2="";

		int length =7;
		Random random = new Random();
		char[] text = new char[length];
		char[] text2 = new char[length];



		for(int i=0;i<length;i++)
		{
			//  The nextInt(int n) is used to get a random number between 0(inclusive) and the number passed in this argument(n), exclusive.
			text[i]= alphabet.charAt(random.nextInt(alphabet.length()));
		}

		for(int i=0;i<length;i++)
		{
			//  The nextInt(int n) is used to get a random number between 0(inclusive) and the number passed in this argument(n), exclusive.
			text2[i]= alphabet.charAt(random.nextInt(alphabet.length()));
		}

		for(int i=0;i<text.length;i++)
		{
			name=name+text[i];
			name2=name2+text2[i];
		}


		File file2= new File(file,name);

		File file3= new File(file,name2);

		System.out.println(name);
		System.out.println(name2);

		file2.createNewFile();
		file3.createNewFile();




	}

}
