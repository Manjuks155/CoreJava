package com.techie.core.exceptionhandling;

import java.util.Scanner;

class DivideWithZeroException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String errorMessage;

	DivideWithZeroException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String toString() {
		return errorMessage;
	}

}

public class UserDefinedException1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the first operand: ");
		int a1 = scn.nextInt();
		System.out.println("Enter the second operand: ");
		int a2 = scn.nextInt();

		try {
			if (a2 < 1) {
				throw new DivideWithZeroException("Divide with zero exception");
			} else {
				int quotient = a1 / a2;
				System.out.println("Quotient is : " + quotient);
			}
		} catch (DivideWithZeroException ex) {
			System.out.println(ex);
			// ex.printStackTrace();

		} finally {
			scn.close();
		}

	}

}
