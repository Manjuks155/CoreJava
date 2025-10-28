package com.techie.corejava;

public class VariableShadow {

	int x = 10;

	public static void main(String[] args) {

		int x = 20;

		System.out.println(x);
	}

}
