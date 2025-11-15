package com.techie.core.oops;

interface InterfaceTest {
	
	void display();
	
}

public class AnonymousInnerClass2 {

	public static void main(String[] args) {

		InterfaceTest interfaceTest = new InterfaceTest() {
			
			public void display() {
				System.out.println("This is ananymous inner class from interface");
			}
		};
		
		interfaceTest.display();
		
		
		
	}

}
