package com.techie.core.interfaces;

interface Interface1 {
	String name = "interface 1";

	default void show() {
		System.out.println("This is " + Interface1.name);
	}
}

interface Interface2 {
	String name = "interface - 2";

	default void show() {
		System.out.println("This is " + Interface2.name);
	}
}

public class DiamondProblemDefaultMethods implements Interface1, Interface2 {
	public void show() {
		Interface1.super.show();
		Interface2.super.show();
	}

	public static void main(String[] args) {
		DiamondProblemDefaultMethods diamondProblem = new DiamondProblemDefaultMethods();
		diamondProblem.show();

	}

}
