package com.tcs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;

public class PropertiesEx 
{

	public static void main(String[] args) throws IOException 
	{
		//load the properties file
		FileInputStream inputStream = new FileInputStream("abc.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		
		
		//read the data from properties files 
		System.out.println(properties.getProperty("id"));    //657575
		System.out.println(properties.getProperty("username")); //testuser
		System.out.println(properties.getProperty("password")); //login
		System.out.println(properties.getProperty("port")); //8080  

	}

}

class Sync
{
	public static void main(String[] args) 
	{
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
		
	}
}