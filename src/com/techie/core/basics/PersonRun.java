package com.techie.core.basics;

import java.lang.ref.WeakReference;

class Person {
	
}

public class PersonRun {

	public static void main(String[] args) {
		
	WeakReference<Person> personObj = new WeakReference<Person> (new Person());	

	}

}
