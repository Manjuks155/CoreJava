package com.techie.core.exceptionhandling;

import java.util.Scanner;

public class UserDefinedException3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		int amount = scn.nextInt();

		try {
			if (amount < 500) {
				throw new ArithmeticException() {
					/**
					 * 
					 */
					private static final long serialVersionUID = -6456007006575184113L;

					public String toString() {
						return "You don't have enough money to withdraw!!";
					}
				};
			} else {
				System.out.println(amount + " Amount has been withdrawn succesfully!!");
			}
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		} finally {
			scn.close();
		}

	}

}
