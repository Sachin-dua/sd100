package com.fileIO.examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountOccurences {
	public static void main(String[] args) throws IOException {
		File file = new File("4lines");
		file.mkdir();
		File file2 = new File(file,"a.txt");
		file2.createNewFile();

		try(BufferedReader reader = new BufferedReader(new FileReader(file2));
				Scanner scanner = new Scanner(System.in))
		{
			int count=0;
			String input= scanner.next();
			String readData;

			while((readData=reader.readLine())!=null)
				if(readData.contains(input))
				{
					count=count+1;
				}

			System.out.println(input +" is occured: "+count+" time/s");

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}
