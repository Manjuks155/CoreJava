package com.techie.core.basics;

public class MethodAndParameterScope {

	static int x = 10;
	private int y = 20;
	int z;

	public void testFunc(int z) {

		MethodAndParameterScope mp = new MethodAndParameterScope();
		this.x = 30;
		y = 40;
		this.y = 50;

		System.out.println("MethodAndParameterScope.x is : " + MethodAndParameterScope.x);
		System.out.println("mp.x : " + mp.x);
		System.out.println("mp.y : " + mp.y);
		System.out.println("y : " + y);
		
		System.out.println("before z : " + this.z);
		this.z = z;
		System.out.println("After z : " + z);
	}

	public static void main(String[] args) {
		MethodAndParameterScope mpObj = new MethodAndParameterScope();
		mpObj.testFunc(100);
	}

}
