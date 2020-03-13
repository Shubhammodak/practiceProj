package com.qa.eprocbilling.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Base {
	public static Properties prop;
	public static FileInputStream fis = null;
	 public Base(){
		prop = new Properties();
	//System.out.println(System.getProperty("user.dir"));
	
	try {
		fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\java\\com\\qa\\eprocbilling\\config\\config.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
