package com.techie.core.arrays;

import java.util.Arrays;

public class RemoveItems {

	static void removeElementAtIndex(Object[] arr, int index) {

		if (index < 0 || index >= arr.length)
			return;

		for (int i = index; i < arr.length - 1; i++) {
			arr[index] = arr[index + 1];
		}
		arr[arr.length - 1] = null;

	}

	public static void main(String[] args) {
		Integer[] intArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int index = 5;
		removeElementAtIndex(intArray, index);
		System.out.println(Arrays.toString(intArray));
	}

}
