package com.techie.core.basics;

public class DecisionMaking {

	public static void main(String[] args) {

		for (int num = 1; num <= 20; num++) {
			
			switch (num) {

			case 5:
				System.out.println("It is 5");
				break;

			case 10:
				System.out.println("It is 10");
				break;

			case 15:
				System.out.println("It is 15");
				break;

			default:
				System.out.println("this is default: " + num);

			}
		}

	}

}
