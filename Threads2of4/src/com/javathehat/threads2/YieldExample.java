package com.javathehat.threads2;

/**
 * @author javathehat.com
 */
public class YieldExample {
	
	public static void main(String[] args){
		
		System.out.println("Go Go Power Rangers!");
		long start = System.currentTimeMillis();
		for(int i = 0; i <1000; i++){
			new Thread().start();
			new Thread().start();
			new Thread().start();
			
			Thread.currentThread().yield();
			Thread.yield();
		}
		
		System.out.println(System.currentTimeMillis() - start );
	}
	

}
