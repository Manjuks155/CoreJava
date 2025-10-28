package com.techie.corejava;

public class BlockLevelScope {

	public static void main(String[] args) {

		int i = 20;
		for (i = 0; i < 10; i++) {
			System.out.println(i + " ");
		}
		System.out.println(i);

		
		for (int j = 0; j < 10; j++) {
			System.out.println(j + " ");
		}
		int j = 30;
		System.out.println(j);

	}
}
