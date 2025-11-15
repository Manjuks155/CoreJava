package com.techie.core.multithreading;

class MyThreadC implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " - is running");
	}

}

public class ImplementingRunnable {

	public static void main(String[] args) {
		MyThreadC myThreadc = new MyThreadC();
		Thread thread = new Thread(myThreadc);
		thread.start();
	}

}
