package com.techie.core.exceptionhandling;

import java.util.Scanner;

class InvalidWithDrawMoneyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4682809783482070456L;

	public String toString() {
		return "You don't have enough money to withdraw";
	}

}

public class UserDefinedException2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the amount to withdraw : ");
		int amount = scn.nextInt();

		try {
			if (amount < 500) {
				throw new InvalidWithDrawMoneyException();
			} else
				System.out.println(amount + " Amount has been withdrawn successfully!!");

		} catch (InvalidWithDrawMoneyException ex) {
			System.out.println(ex);
		} finally {
			scn.close();
		}

	}

}
