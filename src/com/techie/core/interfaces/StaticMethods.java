package com.techie.core.interfaces;

interface TestInterface1 {
	String name = "Test interface - 1";

	static void show() {
		System.out.println("This is the " + TestInterface1.name);
	}
}

interface TestInterface2 extends TestInterface1 {
	String name = "Test interface - 2";

//	static void show() {
//		System.out.println("This is the " + TestInterface2.name);
//	}
}

public class StaticMethods implements TestInterface1, TestInterface2 {

	public static void main(String[] args) {

//		StaticMethods staticMethods = new StaticMethods();
//		TestInterface1.show();
//		TestInterface2.show();
		
		TestInterface1.show();
		
//		static method is not inherited
//		TestInterface2.show();
//		StaticMethods.show();
		
		

	}

}
