package com.techie.core.multithreading;

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread - " + i + " is running");
			System.out.println(Thread.currentThread().getClass().getName());
		}
	}
}

public class ExtendingThreadClass {

	public static void main(String[] args) {
		MyThread myThread = new MyThread();
		myThread.start();
	}

}
