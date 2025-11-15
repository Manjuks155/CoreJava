package com.techie.core.arrays;

public class ArraysEquality {

	static boolean checkArraysEqualityWithForLoop(Object[] arr1, Object[] arr2) {

		if (arr1 == arr2)
			return true;

		if (arr1 == null || arr2 == null)
			return false;

		if (arr1.length != arr2.length)
			return false;

		for (int i = 0; i < arr1.length; i++) {
			if (!(arr1[i].equals(arr2[i])))
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5, 6 };
		Integer[] arr2 = { 1, 2, 3, 4, 5, 6 };

		String[] strArray1 = { "Java", "Python", "AWS", "Cloud" };
		String[] strArray2 = { "Java", "Python", "AWS", "Cloud" };

		boolean check = checkArraysEqualityWithForLoop(null, strArray1);

		if (check)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");

	}

}
