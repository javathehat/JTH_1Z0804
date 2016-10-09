package com.javathehat.threads3.synchronize.shop;

/**
 * @author javathehat.com
 */
public class WaterCloset {
	
	private volatile int flushCounter = 0;
	
	public void flushWater(){
		System.out.println("Water flushes today: " + ++flushCounter);
	}
	
	public int getFlushCounter(){
		return flushCounter;
	}
	
}
