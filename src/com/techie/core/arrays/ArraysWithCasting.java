package com.techie.core.arrays;

class A {

	int i;

	void methodOne() {
		System.out.println("From class A");
	}
}

class B extends A {

	void methodOne() {
		System.out.println("From class B");
	}

}

public class ArraysWithCasting {

	public static void main(String[] args) {

		String str = "Java" + 8;
		System.out.println(str);

	}

}
