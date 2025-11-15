package com.techie.core.oops;

class SuperClassTest {

	void show() {
		System.out.println("This is super class test");
	}

	void test() {
		System.out.println("This is a test method");
	}
}

public class AnonymousInnerClass {

	public static void main(String[] args) {

		SuperClassTest superClassTest = new SuperClassTest() {
			void show() {
				System.out.println("This is the anonymous inner class");
			}
		};

		superClassTest.show();

		new SuperClassTest() {
			void test() {
				System.out.println("This is the test method from Anonymous inner class");
			}
		}.test();

	}

}
