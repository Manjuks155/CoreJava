package com.techie.core.oops;

class TestSuperClass {

	private void privateMethod() {
		System.out.println("This is a private method");
	}

	static void staticMethod() {
		System.out.println("This is a static method");
	}

	final void finalMethod() {
		System.out.println("This is a final method");
	}

}

public class TestPrivateStaticFinalInheritance extends TestSuperClass {

	// method hiding
	static void staticMethod() {
		System.out.println("This is a static method");
	}

	public static void main(String[] args) {

		TestPrivateStaticFinalInheritance obj = new TestPrivateStaticFinalInheritance();
		// obj.privateMethod();
		obj.staticMethod();
		obj.finalMethod();

	}

}
