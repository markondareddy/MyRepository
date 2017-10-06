package com.general;

import java.net.MalformedURLException;
import java.net.URL;

public class Abs {
	public static void main(String args[]) throws MalformedURLException {
		    long millis = System.currentTimeMillis();
	        System.out.println("Current time in millis: "+millis);
	        URL url=new URL("http://www.javatpoint.com/java-tutorial");  
	        
	        System.out.println("Protocol: "+url.getProtocol());  
	        System.out.println("Host Name: "+url.getHost());  
	        System.out.println("Port Number: "+url.getPort());  
	        System.out.println("File Name: "+url.getFile()); 
			
			
			
			
			
	        
	        }
	}

