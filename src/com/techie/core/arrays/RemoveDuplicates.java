package com.techie.core.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {

	static void removeDuplicates(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		// for (int item : arr) {
		// if (map.containsKey(item)) {
		// map.put(item, map.get(item) + 1);
		// } else {
		// map.put(item, 1);
		// }
		// }
		//
		// System.out.println("Duplicate items are:");
		// for (int key : map.keySet()) {
		// if (map.get(key) > 1) {
		// System.out.println(key);
		// }
		// }
		// System.out.println();

		Map<Integer, Boolean> intMap = new HashMap<Integer, Boolean>();
		int count = 0;
		for (int item : arr) {
			if (!(intMap.containsKey(item))) {
				intMap.put(item, true);
				count++;
			}

		}

		Set<Integer> intSet = new HashSet<Integer>();
		for (int item : arr) {
			intSet.add(item);
		}

		System.out.println("Array length is: " + arr.length);
		System.out.println(intMap.keySet());
		System.out.println("Count is: " + count);

		System.out.println("Elements from set are: " + intSet);

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 5, 6, 4, 5, 8, 9, 7, 2, 1, 4 };
		removeDuplicates(arr);

		Integer[] integers = new Integer[2];
		System.out.println(Arrays.toString(integers));

		Integer[] intArray = { 10, 20, 30, 40, 50, 60 };
		List<Integer> list = Arrays.asList(intArray);
		System.out.println(list);

	}
}
