package com.techie.core.exceptionhandling;

import java.util.Scanner;

public class ChainedExceptions {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = scn.nextInt();

		try {
			if (number < 1) {
				// throw new RuntimeException("Less than 1", new ArithmeticException());

				ArithmeticException arEx = new ArithmeticException("Invalid number - less than 1");
				arEx.initCause(new NumberFormatException());
				throw arEx;

			} else {
				System.out.println("Number is valid!!");
			}
		}
		// catch(RuntimeException ex) {
		catch (ArithmeticException ex) {
			System.out.println(ex);
			System.out.println(ex.getCause());
		}

	}

}
