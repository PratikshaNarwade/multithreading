package com.jspiders.multithreading.thread;

public class MyThread3 extends Thread {
	
//	@Override
//	public void run() {
//		System.out.println("My Thread 3 is now running");
//	}
	
	@Override
	public void run() {
		System.out.println("Thread Name is : "+ getName());
		System.out.println("Thread Priority : " + this.getPriority());
	}
}
