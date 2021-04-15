package com.tcs;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

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
		System.out.println(properties.getProperty("portdassd")); //8080  

	}

}

