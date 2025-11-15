package com.techie.core.accessspecifiers;

import com.techie.core.basics.A;

public class D extends A {
	void methodOfClassD() {
		// System.out.println(j); Default members can not be inherited outside package
		System.out.println(k); // Protected member can be inherited to any subclass
		System.out.println(m); // public member is always inherited to any subclass

		A a = new A();
		// System.out.println(a.i); private member not visible outside the class
		// System.out.println(a.j); Default members are not visible outside package
		// System.out.println(a.k); // Protected member can not be used outside the
		// package.

		
		System.out.println(a.m); // public member can be used anywhere

		/*
		Within the same package: A protected member (field or method) is fully accessible from any class within the same package, 
								regardless of whether it's a subclass or not. 
		Outside the package: This is where the nuance lies.

		Through Inheritance: A protected member can be accessed from a subclass located in a different package. 
							However, this access is restricted: you must access the protected member using an instance of the subclass itself 
							(or a subclass of that subclass), not an instance of the superclass.
		Without Inheritance (Non-subclass): A protected member cannot be accessed from a class in a different package 
											if that class is not a subclass of the class containing the protected member. 
		*/
		
		
		D obj = new D();
		System.out.println(obj.k);

	}
}

class E extends D {
	void methodOfClassE() {
		System.out.println(k); // Protected member can be inherited to any subclass
		System.out.println(m); // public member is always inherited

		D d = new D();
		// System.out.println(d.k); // Protected member can not be used outside the
		// package.
		System.out.println(d.m); // public member can be used anywhere
	}
}