package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.main.resource.Pizza;

public class Dominos extends Thread {
    private Pizza pizza;
	
    public Dominos(Pizza pizza) {
    	this.pizza = pizza;
    }
	
    @Override
	public void run() {
		pizza.bakedPizza(5);
	}
	
}
