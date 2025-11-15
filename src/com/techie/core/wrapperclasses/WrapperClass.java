package com.techie.core.wrapperclasses;

public class WrapperClass {

	public static void main(String[] args) {

		// primitive to wrapper object
		int i = 10;

		// using constructor
		Integer object1 = new Integer(i);

		// using static factory method
		Integer object2 = Integer.valueOf(i);

		// wrapper class object to primitive
		Integer integerObject = new Integer(i);
		int intValue = integerObject.intValue();

		char ch = 'c';
		Character chObj1 = new Character(ch);
		Character chObj2 = Character.valueOf(ch);

		char chVal = chObj1.charValue();

	}

}
