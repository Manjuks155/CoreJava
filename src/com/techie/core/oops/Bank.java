package com.techie.core.oops;

public class Bank {

	String name;

	Bank() {
		this.name = "Nationalized";
	}

	Bank(String name) {
		this.name = name;
	}

	void getDetails() {
		System.out.println("This is a " + name + " bank");
	}
}
