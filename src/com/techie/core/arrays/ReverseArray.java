package com.techie.core.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		char[] chArray = new char[] { 'A', 'B', 'C', 'D', 'E' };
		System.out.println(Arrays.toString(chArray));
		
		int len = chArray.length;
		for (int i = 0; i < len / 2; i++) {
			char temp = chArray[i];
			chArray[i] = chArray[len - 1 - i];
			chArray[len - 1 - i] = temp;
		}
		
		System.out.println(Arrays.toString(chArray));

	}

}
