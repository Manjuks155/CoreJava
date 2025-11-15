package com.techie.core.arrays;

import java.util.Arrays;

public class TwoDimension {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 10, 20, 30, 40, 50, 60 };
		int[] arr3 = new int[6];
		arr3[0] = 100;
		arr3[1] = 200;
		arr3[2] = 300;
		arr3[3] = 400;
		arr3[4] = 500;
		arr3[5] = 600;

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));

		int hundred = 100;
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = hundred;
			hundred++;
		}

		int[][] twoDimesArray = { arr1, arr2, arr3 };

		for (int i = 0; i < twoDimesArray.length; i++) {
			System.out.print("{");
			for (int j = 0; j < twoDimesArray[i].length; j++) {
				if (j < twoDimesArray[i].length - 1)
					System.out.print(twoDimesArray[i][j] + ", ");
				else
					System.out.print(twoDimesArray[i][j]);
			}
			System.out.println("}");
		}

	}

}
