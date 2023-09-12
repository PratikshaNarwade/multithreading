package com.jspiders.multithreading.main.resource;

public class Pizza {
	
	private int availablePizza;

//	public Pizza(int availablePizza) {
//		this.availablePizza = availablePizza;
//	}
	
	public synchronized void orderPizza(int orderPizza) {
		System.out.println("Trying to order " + orderPizza + " Pizzas.");
		if(availablePizza < orderPizza) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		availablePizza-=orderPizza;
		System.out.println(orderPizza + " pizzas Available");
		System.out.println("Available Pizza : " + availablePizza);
	}
	
	public synchronized void bakedPizza(int backPizza) {
		System.out.println("Trying to baked " + backPizza + " Pizzas.");
		availablePizza+=backPizza;
		System.out.println(availablePizza +" Pizzas available");
		System.out.println(availablePizza +" Pizzas delivered");
		this.notify();
	}
	
	

}
