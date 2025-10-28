package com.techie.corejava;

import java.util.Scanner;

public class GuessingNumberGame {

	public static void main(String args[]) {

		int randomNum = (int) (Math.random() * 100);
		int attempts = 5;

		Scanner scn = new Scanner(System.in);

		System.out.println("A number is choosen between 1 and 100");
		System.out.println("You have " + attempts + "attempts to guess the correct answer");

		for (int i = 0; i < attempts; i++) {
			System.out.print("Enter your guess: ");
			int guessNumber = scn.nextInt();

			if (randomNum > guessNumber) {
				System.out.println("The number is greater than " + guessNumber);
			} else if (randomNum < guessNumber) {
				System.out.println("The number is less than " + guessNumber);
			} else {
				System.out.println("You have correct guess: " + randomNum);
			}
		}
		System.out.println("You have exausted all the " + attempts + " attmpts and the correct number is " + randomNum);
	}

}
