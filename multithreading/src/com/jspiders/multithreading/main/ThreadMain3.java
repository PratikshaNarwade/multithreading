package com.jspiders.multithreading.main;

import com.jspiders.multithreading.thread.MyThread3;

public class ThreadMain3 {
	
	public static void main(String[] args) {
		
//		MyThread3 myThread3 = new MyThread3();
//		System.out.println("Thread Name : " + myThread3.getName());
//		System.out.println("Thread Priority : " + myThread3.getPriority());
//		myThread3.start();
		
//		MyThread3 myThread = new MyThread3();
//		myThread.start();
		
		MyThread3 myThread3 = new MyThread3();
		myThread3.setName("Thread7");
		myThread3.setPriority(9);
		myThread3.start();
	}

}
