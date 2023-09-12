package com.jspiders.multithreading.main;

public class SleepDemo {

	public static void main(String[] args) {
		
		String str = "This is sleep demo";
		
		for(int i = 0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
