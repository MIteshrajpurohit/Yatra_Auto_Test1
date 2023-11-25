package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class DataRead {

	     public static FileInputStream fis; 
	     public static Properties pro;
	     
	     public  static String fileR(String key) {
	    	 pro = new Properties();
	    	 try {
				fis = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/TestData.properties");
                 pro.load(fis); 			
	    	 } catch (Exception e) {
			}
	    	 
	    	 
	    	 
	    	 return pro.getProperty(key);
	    	
	    	 
	    	 }
	    
	     
	     
	
	
}
