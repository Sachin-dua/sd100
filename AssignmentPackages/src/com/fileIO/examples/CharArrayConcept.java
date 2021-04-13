package com.fileIO.examples;

import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayConcept {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("xyz.txt");
		FileWriter writer1 = new FileWriter("x.txt");
		FileWriter writer2 = new FileWriter("y.txt");

		CharArrayWriter ch = new CharArrayWriter();

		int c;
		while((c=reader.read())!=-1)
		{
			ch.write(c);
		}

		ch.writeTo(writer1);
		ch.writeTo(writer2);

		reader.close();
		ch.close();
		writer1.close();
		writer2.close();



	}

}



