package com.techie.core.exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {

		String[] arr = { "250", "abc", "12e", "2000" };

		for (int i = 0; i < arr.length; i++) {
			try {
				System.out.println(i + 1 + ")");
				int a = Integer.parseInt(arr[i]);
				System.out.println("\t" + a);
			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				System.out.println("\tfinally block is always executed");

			}
			System.out.println("\toutside try catch and finally blocks");
			System.out.println("_____________________________________________________________________________");
			System.out.println();
		}

	}

}
