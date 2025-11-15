package com.techie.core.exceptionhandling;

public class ReturnValue {

	static int returnValueFromBlocks() {
		try {
			return 1;
		} catch (Exception ex) {
			return 2;
		} finally {
			return 3;
		}
//		return 100;
	}

	public static void main(String[] args) {

		System.out.println(returnValueFromBlocks());

	}

}
