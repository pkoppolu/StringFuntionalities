package com.info.strings;
public class StringFunctions {
public static void main(String[] args) {
	String s1 = "prudhvi";
	String s2 = "RISHI";
	String s3 = "rishi";
	System.out.println("String1 in Upper case is "+s1.toUpperCase()); 
	
	System.out.println("String1 in Lower case is "+s1.toLowerCase());
	
	System.out.println("String1 concatenating with String2 is "+s1.concat(s2));
	
	System.out.println("String1 length is"+s1.length());
	
	System.out.println("Position of 4th letter in String1 is "+s1.charAt(3));
	
	System.out.println("The letters between 2 and 5 in String1 is "+s1.substring(2,5));
	
	if(s1.startsWith("pru")) {
		System.out.println("It's TRUE");
	}
	else {
		System.out.println("It's FALSE");
	}
	
	if(s2.endsWith("HI")) {
		System.out.println("It's TRUE");
	}
	else {
		System.out.println("It's FALSE");
	}
	
	if(s2.equals(s3)) {
		System.out.println("It's TRUE");
	}
	else {
		System.out.println("It's FALSE");
	}	
	
	if(s2.equalsIgnoreCase(s3)){
		System.out.println("It's TRUE");
	}
	else {
		System.out.println("It's FALSE");
	}	
	
 }
}
