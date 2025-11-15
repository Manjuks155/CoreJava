package com.techie.core.arrays;

public class WrapperClassTypes {

	public static void main(String[] args) {

		Number[] numbers = new Number[3];
		numbers[0] = 10;
		numbers[1] = 2.5;

		for(Object o : numbers)
			System.out.println(o);

	}

}
