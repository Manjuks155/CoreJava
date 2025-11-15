package com.techie.core.exceptionhandling;

public class TryCatchFinally1 {

	public static void main(String[] args) {

		try {
			String str = "Java";
			char ch = str.toCharArray()[5];
			System.out.println("The character is : " + ch);
		} finally {
			System.out.println("Finally will always be executed");
		}
		
		
		
	}

}
