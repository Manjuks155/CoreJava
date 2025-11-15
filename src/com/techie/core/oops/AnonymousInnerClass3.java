package com.techie.core.oops;

interface InterfaceTest3 {
	void display();
}

public class AnonymousInnerClass3 {

	public static void main(String[] args) {

		new InterfaceTest3() {
			public void display() {
				System.out.println("This is the anonymous inner class test 3");
			}
		}.display();

	}

}
