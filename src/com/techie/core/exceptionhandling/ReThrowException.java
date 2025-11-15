package com.techie.core.exceptionhandling;

public class ReThrowException {

	static void methodWithReThrow() {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException is caught here");
			throw ex;
		}
	}

	public static void main(String[] args) {
		try {
			methodWithReThrow();
		} catch (NullPointerException ex) {
			System.out.println("NullPointerException re-thrown is caught here");
		}
	}

}
