package com.techie.core.string;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Java concept of the day";
		
		str = str.toUpperCase();

		// chatAt
		System.out.println(str.charAt(1));

		// toCharArray
		System.out.println(str.toCharArray());

		// subString
		System.out.println(str.substring(1));
		System.out.println(str.substring(2, 3));
		
		System.out.println(str.length());
		System.out.println(str.indexOf('Y'));
		
		str.intern();

	}

}
