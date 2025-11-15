package com.techie.core.oops;

public class RunBank {

	static void printDetails(Bank bank) {
		bank.getDetails();

		if (bank instanceof SbiBank) {
			SbiBank sbiBank = (SbiBank) bank;
			sbiBank.getDetails();
			sbiBank.getSbiBankAddress();
		}

		if (bank instanceof SbmBank) {
			SbmBank sbmBank = (SbmBank) bank;
			sbmBank.getDetails();
			sbmBank.getSbiBankAddress();
			sbmBank.getSbmBankAddress();
			sbmBank.getSbmBankFullName();
		}
	}

	public static void main(String[] args) {
		Bank bank = new SbiBank("SBM");
		printDetails(bank);
	}

}
