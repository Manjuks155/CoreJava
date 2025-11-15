package com.techie.core.oops;

// by default interface is abstract so no need to provide/add abstract keyword to interface
interface InterfaceExample {

	// by default, variables - public, static, final
	// by default, methods -public, abstract

	int balance = 100;
	String bankName = "SBI";

	void display();

}

public class InterfaceClassExample implements InterfaceExample {

	public void display() {
		System.out.println("Bank name and balance are : " + bankName + " and " + balance);
	}

	public static void main(String[] args) {
		InterfaceExample interfaceExample = new InterfaceClassExample();
		interfaceExample.display();
	}

}