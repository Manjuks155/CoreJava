package com.techie.core.problems;

public class StackOverFlowError {

	/*	
	This code fails at runtime because it causes a `java.lang.StackOverflowError`.

	## Why It Happens

	The problem is this line, which is an **instance variable**:

	```java
	StackOverFlowError stackOverFlowError = new StackOverFlowError();
	```

	Here is the step-by-step execution flow that causes the error:

	1.  Your `main` method starts and tries to create a new object: `new StackOverFlowError()`. Let's call this `Object_1`.
	2.  Before Java can run the constructor (the `System.out.println("Hello");` part), 
		it must first initialize all the **instance variables** of `Object_1`.
	3.  It finds the *only* instance variable: `stackOverFlowError`.
	4.  To initialize this variable, it must execute `new StackOverFlowError()`. This attempts to create a *second* object, `Object_2`.
	5.  Before Java can run the constructor for `Object_2`, it must initialize *its* instance variables.
	6.  It finds the `stackOverFlowError` variable and, to initialize it, must execute `new StackOverFlowError()`... creating `Object_3`.

	This process creates an **infinite recursion**: creating an object requires creating another object, 
	which requires creating another object, and so on, forever.

	Each of these nested "create" attempts is added to the **call stack**. Since the stack has limited memory, 
	it quickly fills up, and the program crashes with a `StackOverflowError`.

	The `System.out.println("Hello");` line is **never reached** because the error happens during the field initialization, 
	which occurs *before* the constructor's body is executed.

	Would you like to see how to fix this code to properly create an object?

	 */


	StackOverFlowError() {
		System.out.println("Hello");
	}

	// Recursive calls
	StackOverFlowError stackOverFlowError = new StackOverFlowError();

	public static void main(String[] args) {

		StackOverFlowError stackOverFlowError = new StackOverFlowError();

	}

}
