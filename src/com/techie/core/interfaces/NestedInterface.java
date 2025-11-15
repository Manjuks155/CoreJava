package com.techie.core.interfaces;

interface OuterInterface {

	void display();

	interface InnerInterface {
		void show();
	}
}

public class NestedInterface implements OuterInterface.InnerInterface {

	public void show() {
		System.out.println("This is the inner interface of interface");
	}

	public static void main(String[] args) {

		OuterInterface.InnerInterface innerInterface = new NestedInterface();

		innerInterface.show();

	}


}
