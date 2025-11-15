package com.techie.core.oops;

@FunctionalInterface
interface FunctionalInterfaceTest {

	void display();
}

public class FunctionalInterfaceClass implements FunctionalInterfaceTest {

	public void display() {
		System.out.println("This is functional interface");
	}

	public static void main(String[] args) {
		FunctionalInterfaceTest functionalInterfaceTest = new FunctionalInterfaceClass();
		functionalInterfaceTest.display();
	}

}
