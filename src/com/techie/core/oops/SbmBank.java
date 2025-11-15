package com.techie.core.oops;

public class SbmBank extends SbiBank {

	SbmBank(String name) {
		super(name);
	}

	void getSbmBankAddress() {
		System.out.println(name + " bank is located in malleshwaram");
	}

	void getSbmBankFullName() {
		System.out.println("This is state bank of mysore");
	}

}
