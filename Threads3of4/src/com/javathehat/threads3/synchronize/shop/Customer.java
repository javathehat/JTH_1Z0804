package com.javathehat.threads3.synchronize.shop;

/**
 * @author javathehat.com
 */
public class Customer extends Thread{

	private WaterCloset wc;
	private String name;
	
	public Customer(String name, WaterCloset wc){
		
		this.name = name;
		this.wc = wc;
	}
	
	public void run(){
		System.out.println(String.format("Customer %s is shopping", name));
		
		try {
			Thread.sleep((long) (1000l*Math.random()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(String.format("Customer %s is going to WC", name));
		
		synchronized(wc){
			System.out.println(String.format("Customer %s is inside WC", name));
			wc.flushWater();
			System.out.println(String.format("Customer %s is leaving WC", name));
		}
	}
}
