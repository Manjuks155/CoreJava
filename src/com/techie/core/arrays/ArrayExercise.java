package com.techie.core.arrays;

import java.util.Arrays;

public class ArrayExercise {

	public static void main(String[] args) {

		int[] a = new int[] { 10, 20, 30, 40, 50, 60 };
		int[] b = a;

		System.out.println(a == b);

		b = new int[] { 11, 22, 33, 44, 55, 66 };
		System.out.println(a == b);

		int len = b.length;
		int[] c = new int[len];

		for (int i = 0; i < len; i++) {
			c[i] = b[i];
		}

		System.out.println(Arrays.toString(c));
		
		
		boolean[] booleanArray = new boolean[1];
		booleanArray[0] = false;
		
		String[] strArray = new String[2];
		strArray = new String[] {"Java", "Python", "AWS", "SQL"};
		System.out.println(Arrays.toString(strArray));
		
		for (String str : strArray)
			System.out.println(str);

	}

}
