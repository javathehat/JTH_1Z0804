package com.javathehat.threads3.synchronize.shop;

/**
 * @author javathehat.com
 */
public class Shop {

	public static void main(String[] args) {
		
		WaterCloset wc = new WaterCloset();
		
		Owner owner = new Owner(wc);
		owner.start();
		
		Worker w1 = new Worker("Johny", wc);
		Worker w2 = new Worker("George", wc);
		
		Customer c1 = new Customer("April", wc);
		Customer c2 = new Customer("Winter", wc);
		Customer c3 = new Customer("Tom", wc);
		
		w1.start();
		w2.start();
		c1.start();
		c2.start();
		c3.start();
	}

}
