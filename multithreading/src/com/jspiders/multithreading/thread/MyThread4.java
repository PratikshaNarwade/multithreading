package com.jspiders.multithreading.thread;

public class MyThread4 implements Runnable {
	
	@Override
	public void run() {
		
		System.out.println("Thread Name is : " + Thread.currentThread().getName());
		System.out.println("Thread Priority is : " + Thread.currentThread().getPriority());
		
	}

}
