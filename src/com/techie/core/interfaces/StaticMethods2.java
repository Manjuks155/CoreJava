package com.techie.core.interfaces;

class SuperClass2 {
	static String name = "Super class - 2";

	static void display() {
		System.out.println("This is the " + name);
	}
}

class SubClass2 extends SuperClass2 {
	static String name = "Sub class - 2";

//	static void display() {
//		System.out.println("This is the " + name);
//	}
	
}

public class StaticMethods2 {

	public static void main(String[] args) {
//		SubClass2 subClass2 = new SubClass2();
//		subClass2.display();
		
		SubClass2.display();
		
	}

}
