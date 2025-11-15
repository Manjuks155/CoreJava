package com.techie.core.arrays;

import java.util.Arrays;

class Vehicle {
	int val;

	Vehicle(int val) {
		this.val = val;
	}

	public String toString() {
		return "Vehicle-" + val;
	}
}

public class FinalArray {

	static final int[] arr;

	static {
		arr = new int[] { 10, 20, 30, 40 };
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(arr));

		final int[] intArray = new int[] { 11, 22, 33, 44 };
		System.out.println(Arrays.toString(intArray));
		intArray[1] = 2222;
		System.out.println(Arrays.toString(intArray));

		final String[] strArray = { "Java", "Python", "AWS", "Spring" };
		System.out.println(Arrays.toString(strArray));
		strArray[1] = "Core python";
		System.out.println(Arrays.toString(strArray));

		final Vehicle[] vehicleArray = { new Vehicle(10), new Vehicle(20), new Vehicle(30), new Vehicle(40) };
		System.out.println(Arrays.toString(vehicleArray));
		vehicleArray[2] = new Vehicle(300);
		System.out.println(Arrays.toString(vehicleArray));

	}

}
