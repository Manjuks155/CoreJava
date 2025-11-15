package com.techie.core.oops;

class A {
	
}

class B extends A {
	
}

class OverridingSuperClass {

	int value = 20;
	String name;

	OverridingSuperClass(int value, String name) {
		this.value = value;
		this.name = name;
		System.out.println("calling super class constructor");
	}

	B display(String text) {
		System.out.println("value and name are : " + value + ", " + name);
		System.out.println("Text is : " + text);
		return new B();
	}

}

public class OverridingSubClass extends OverridingSuperClass {

	OverridingSubClass(int val, String name) {
		super(val, name);
		System.out.println("calling sub class constructor");
	}

	 B display(String data) {
		System.out.println("The data is : " +  data);
		return new B();
	}

	public static void main(String[] args) {

	}

}
