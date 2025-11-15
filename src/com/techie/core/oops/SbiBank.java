package com.techie.core.oops;

public class SbiBank extends Bank {

	
	SbiBank(String name) {
		super(name);
	}
	
	void getSbiBankAddress() {
		System.out.println(name + " bank is located in bengaluru");
	}
}
