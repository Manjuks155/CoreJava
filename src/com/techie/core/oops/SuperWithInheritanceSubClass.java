package com.techie.core.oops;

class SuperClass {

	int i;

	SuperClass(int j) {
		System.out.println("This is super class constructor");
	}

	void superClassMethod() {
		System.out.println("This is super class method");
	}
}

public class SuperWithInheritanceSubClass extends SuperClass {

	SuperWithInheritanceSubClass() {
		super(20);
		System.out.println("This is subclass constructor");
	}

	void subClassMethod() {
		System.out.println(super.i);
		super.superClassMethod();
		System.out.println("This is sub class method");
	}

	public static void main(String args[]) {
		SuperWithInheritanceSubClass subClassObject = new SuperWithInheritanceSubClass();
		subClassObject.subClassMethod();
		
		
	}

}
