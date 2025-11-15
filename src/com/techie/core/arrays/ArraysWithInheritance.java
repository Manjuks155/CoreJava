package com.techie.core.arrays;

import java.util.Arrays;

class Aa {
	int i = 10;
}

class Bb extends Aa {
	int j = 20;
}

class Cc extends Bb {
	int k = 30;
}

class Dd extends Cc {
	int m = 40;
}

public class ArraysWithInheritance {

	public static void main(String[] args) {
		Aa[] arr = { new Aa(), new Bb(), new Cc(), new Dd() };
		System.out.println(arr[2].i);
		// System.out.println(arr[2].j);

		// RunTime ClassCastException
		// Bb[] arr1 = (Bb[]) arr;
		// System.out.println(arr1[2].j);

	}

}
