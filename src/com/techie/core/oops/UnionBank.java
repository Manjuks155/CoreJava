package com.techie.core.oops;

public class UnionBank extends Bank {

	UnionBank(String name) {
		super(name);
	}
	
	void getUnionBankAddress() {
		System.out.println(name + " bank is located in Ahmedabad");
	}
}
