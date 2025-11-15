package com.techie.core.exceptionhandling;

public class ExceptionsExamples {

	public static void main(String[] args) {

		String str = "10G";
		try {
			Integer obj = Integer.valueOf(str);
		} catch (NumberFormatException ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}

		try {
			int a = 2000 / 0;
		} catch (ArithmeticException ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}

		try {
			String s1 = args[0];
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("args array length is : " + args.length);
			System.out.println(ex);
			ex.printStackTrace();
		}

		try {
			Object ob = new Object();
			ExceptionsExamples excepExamples = (ExceptionsExamples) ob;
		} catch (Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}

		String s = null;
		try {
			System.out.println(s.length());
		} catch (Exception ex) {
			System.out.println(ex);
			ex.printStackTrace();
		}
		

	}

}
