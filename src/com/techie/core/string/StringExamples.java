package com.techie.core.string;

public class StringExamples {

	public static void main(String[] args) {
		String s1 = "Java ";
		System.out.println("String length is " + s1.length());

		StringBuffer sb = new StringBuffer("AWS");
		System.out.println(sb);

		sb.append(" - Training");
		System.out.println(sb);

	}

}
