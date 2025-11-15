package com.techie.core.oops;

class OuterClass {

	interface InnerInterface {
		void show();
	}

}

public class NestedInterfaceClassRun implements OuterClass.InnerInterface {

	public void show() {
		System.out.println("This is the example of nested interface");
	}

	public static void main(String[] args) {

		OuterClass.InnerInterface obj = new NestedInterfaceClassRun();

		obj.show();

	}
}
